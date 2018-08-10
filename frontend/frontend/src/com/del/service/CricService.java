package com.del.service;

import java.util.List;

import com.del.mvc.bean.Login;
import com.del.mvc.bean.Player;
import com.del.mvc.bean.Schedule;

public interface CricService {

	boolean authenticate(Login login);

	boolean register(Login newLogin);

	List<Schedule> getSchedule();

	boolean validateChoice(Schedule newSchedule);

	String[] getTeams(Schedule newSchedule);

	List<Player> getPlayers(String team);

}
