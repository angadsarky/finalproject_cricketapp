package com.del.project.bean;

public class Match {
private int matchID;
private String team1;
private String team2;
private String date1;
private String location;
public int getMatchID() {
	return matchID;
}
public void setMatchID(int matchID) {
	this.matchID = matchID;
}
public String getTeam1() {
	return team1;
}
public void setTeam1(String team1) {
	this.team1 = team1;
}
public String getTeam2() {
	return team2;
}
public void setTeam2(String team2) {
	this.team2 = team2;
}
public String getDate() {
	return date1;
}
public void setDate(String date) {
	this.date1 = date;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Match(int matchID, String team1, String team2, String date, String location) {
	super();
	this.matchID = matchID;
	this.team1 = team1;
	this.team2 = team2;
	this.date1 = date;
	this.location = location;
}
@Override
public String toString() {
	return "MatchEntity [matchID=" + matchID + ", team1=" + team1 + ", team2=" + team2 + ", date=" + date1
			+ ", location=" + location + "]";
}
public Match() {
}

}
