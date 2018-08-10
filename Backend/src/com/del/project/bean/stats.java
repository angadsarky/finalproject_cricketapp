package com.del.project.bean;

public class stats {
	private String PlayerID;
	private int Matches;
	private int Runs;
	private int Wickets;
	public String getPlayerID() {
		return PlayerID;
	}
	public void setPlayerID(String playerID) {
		PlayerID = playerID;
	}
	public int getMatches() {
		return Matches;
	}
	public void setMatches(int matches) {
		Matches = matches;
	}
	public int getRuns() {
		return Runs;
	}
	public void setRuns(int runs) {
		Runs = runs;
	}
	public int getWickets() {
		return Wickets;
	}
	public void setWickets(int wickets) {
		Wickets = wickets;
	}
	@Override
	public String toString() {
		return "stats [PlayerID=" + PlayerID + ", Matches=" + Matches + ", Runs=" + Runs + ", Wickets=" + Wickets + "]";
	}
	public stats(String playerID, int matches, int runs, int wickets) {
		super();
		PlayerID = playerID;
		Matches = matches;
		Runs = runs;
		Wickets = wickets;
	}
	public stats() {
		
	}
	
}
