package com.del.mvc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.del.mvc.bean.Login;
import com.del.mvc.bean.Player;
import com.del.mvc.bean.Schedule;
import com.del.service.CricService;
import com.del.service.CricServiceImpl;



@Controller
public class MyController {

	@Autowired
	CricService cService;
	
	@RequestMapping(value="/home")
	public String goHome(){
		return "home";
	}
	@RequestMapping(value="/login")
	public String showForm(Model model) {
		model.addAttribute(new Login());
		return "login";
	}
	@RequestMapping(value="/checkLogin")
	public String checkLogin(@ModelAttribute(value="login") Login login, Model model) {
		//code with service/dao/jpa layers
		//cService= new CricServiceImpl();// never create an object. It is springs job
		boolean success = false;
		success = cService.authenticate(login);
		System.out.println(success);
		if(success) {
			System.out.println("inside success");
			List<Schedule> schedule = cService.getSchedule();
			model.addAttribute("schedule",schedule);
			model.addAttribute("MatchID",new Schedule());
			return "success";}
		return "home";
	}
	@RequestMapping(value="/signup")
	public String register(Model model) {
		model.addAttribute("signup", new Login());
		return "signup";		
	}
	
	@RequestMapping(value="/checkSignUp")
	public String checkSignup(@ModelAttribute(value="signup") Login newLogin, Model model) {
		System.out.println("checkSignup");
		boolean success = cService.register(newLogin);
		if(success) {
			model.addAttribute(new Login());
			return "login";}
		return "home";
	}
	
	@RequestMapping(value="/checkChoice")
	public String validateChoice(@ModelAttribute(value="MatchID") Schedule newSchedule, Model model) {
		boolean success = cService.validateChoice(newSchedule);
		if(success) {
			String[] teams = cService.getTeams(newSchedule);
//			System.out.println(teams[0]+" "+teams[1]);
			List<Player> Team1Players = cService.getPlayers(teams[0]);
			List<Player> Team2Players = cService.getPlayers(teams[1]);
			//model.addAttribute(arg0, arg1)
			return "playingXI";
		}
		else{
			List<Schedule> schedule = cService.getSchedule();
			model.addAttribute("schedule",schedule);
			model.addAttribute("MatchID",new Schedule());
			return "success";
		}
	}
}
