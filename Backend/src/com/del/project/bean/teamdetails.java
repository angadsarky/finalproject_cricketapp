package com.del.project.bean;

public class teamdetails {
private String TeamID;
private String  TeamName;
public String getTeamID() {
	return TeamID;
}
public void setTeamID(String teamID) {
	TeamID = teamID;
}
public String getTeamName() {
	return TeamName;
}
public void setTeamName(String teamName) {
	TeamName = teamName;
}
@Override
public String toString() {
	return "teamdetails [TeamID=" + TeamID + ", TeamName=" + TeamName + "]";
}
public teamdetails(String teamID, String teamName) {
	super();
	TeamID = teamID;
	TeamName = teamName;
}
public teamdetails() {
	
}

}
