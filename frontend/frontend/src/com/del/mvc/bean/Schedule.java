package com.del.mvc.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
public class Schedule {
	@Id
	private int MatchID;
	private String Team1;
	private String Team2;
	private String date1;
	private String location;
	
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Schedule(int matchID, String team1, String team2, String date1, String location) {
		super();
		MatchID = matchID;
		Team1 = team1;
		Team2 = team2;
		this.date1 = date1;
		this.location = location;
	}
	@Override
	public String toString() {
		return (MatchID + ". " + Team1 +" Vs " + Team2 + " on " + date1+" at "+ location +".");
	}
	public int getMatchID() {
		return MatchID;
	}
	public void setMatchID(int matchID) {
		MatchID = matchID;
	}
	public String getTeam1() {
		return Team1;
	}
	public void setTeam1(String team1) {
		Team1 = team1;
	}
	public String getTeam2() {
		return Team2;
	}
	public void setTeam2(String team2) {
		Team2 = team2;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
