package com.sharad.learn.corejava.sample.cricket;

public class Scorecard {
	private ScorecardType scorecardType;
	private String playerName;
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Scorecard [scorecardType=" + scorecardType + ", playerName=" + playerName + "]";
	}

	public Scorecard(ScorecardType scorecardType,String playerName) {
		super();
		this.scorecardType =scorecardType;
		this.playerName = playerName;
	}
	
	
	
}
