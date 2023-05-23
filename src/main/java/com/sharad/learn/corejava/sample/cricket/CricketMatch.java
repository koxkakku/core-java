package com.sharad.learn.corejava.sample.cricket;

public class CricketMatch 
{
	private Team team1;
	private Team team2;
	private Format format;
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public Format getFormat() {
		return format;
	}
	public void setFormat(Format format) {
		this.format = format;
	}
	public void updatePlayerScore(Country teamCountry,int battingOrder,BattingFigures battingFigures) {
		Team teamOfPlayer = null;
		if(this.team1.getCountry().equals(teamCountry))
			teamOfPlayer=team1;
		else 
			teamOfPlayer=team2;
		teamOfPlayer.getPlayers().get(battingOrder).setBattingFigures(battingFigures);
	}
	public void updatePlayerBowlingFigures(Country teamCountry,int battingOrder,BowlingFigures bowlingFigures) {
		Team teamOfPlayer = null;
		if(this.team1.getCountry().equals(teamCountry))
			teamOfPlayer=team1;
		else 
			teamOfPlayer=team2;
		teamOfPlayer.getPlayers().get(battingOrder).setBowlingFigures(bowlingFigures);
	}
	public CricketMatch(Team team1, Team team2, Format format) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.format = format;
	}
	
	@Override
	public String toString() {
		return "Cricket [team1=" + team1 + ", \n team2=" + team2 + ", \n format=" + format + "]";
	}

}
