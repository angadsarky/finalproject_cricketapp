package com.del.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.dao.CricDao;
import com.del.mvc.bean.Login;
import com.del.mvc.bean.Player;
import com.del.mvc.bean.Schedule;

@Service("cService")
public class CricServiceImpl implements CricService {

	
	private CricDao cDao;
	@Autowired
	public CricServiceImpl(CricDao cDao) {
		this.cDao = cDao;
	}



	public CricServiceImpl() {
		System.out.println("sevice constr");
	}



	public void setcDao(CricDao cDao) {
		System.out.println("set dao");
		this.cDao = cDao;
	}



	@Override
	public boolean authenticate(Login login) {
		System.out.println("login: "+login);
		System.out.println("cdao:"+cDao);
		return cDao.authenticate(login);
	}



	@Override
	public boolean register(Login newLogin) {
		// TODO Auto-generated method stub
		return cDao.register(newLogin);
	}



	@Override
	public List<Schedule> getSchedule() {
		// TODO Auto-generated method stub
		return cDao.getSchedule();
	}



	@Override
	public boolean validateChoice(Schedule newSchedule) {
		// TODO Auto-generated method stub
		return cDao.validateChoice(newSchedule);
	}



	@Override
	public String[] getTeams(Schedule newSchedule) {
		// TODO Auto-generated method stub
		return cDao.getTeams(newSchedule);
	}



	@Override
	public List<Player> getPlayers(String team) {
		// TODO Auto-generated method stub
		return cDao.getPlayers(team);
	}



}
