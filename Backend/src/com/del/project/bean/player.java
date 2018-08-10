package com.del.project.bean;

public class player {
private String PlayerID;
private String PlayerName;
private String Team;
private String TeamID;
public String getPlayerID() {
	return PlayerID;
}
public void setPlayerID(String playerID) {
	PlayerID = playerID;
}
public String getPlayerName() {
	return PlayerName;
}
public void setPlayerName(String playerName) {
	PlayerName = playerName;
}
public String getTeam() {
	return Team;
}
public void setTeam(String team) {
	Team = team;
}
public String getTeamID() {
	return TeamID;
}
public void setTeamID(String teamID) {
	TeamID = teamID;
}
@Override
public String toString() {
	return "player [PlayerID=" + PlayerID + ", PlayerName=" + PlayerName + ", Team=" + Team + ", TeamID=" + TeamID
			+ "]";
}
public player(String playerID, String playerName, String team, String teamID) {
	super();
	PlayerID = playerID;
	PlayerName = playerName;
	Team = team;
	TeamID = teamID;
}
public player() {
	super();
	// TODO Auto-generated constructor stub
}

}
