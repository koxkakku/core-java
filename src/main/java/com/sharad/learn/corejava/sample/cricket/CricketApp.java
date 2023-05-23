package com.sharad.learn.corejava.sample.cricket;

import java.util.stream.IntStream;

public class CricketApp 
{
  public static void main(String[] args) 
  {
	  Team team1=createTeam(Country.INDIA);
	  Team team2=createTeam(Country.PAKISTAN);
	  CricketMatch c = new CricketMatch(team1, team2, Format.ODI);
	  c.updatePlayerScore(team1.getCountry(), 0, new BattingFigures(25, 10, 3, 1));
	  c.updatePlayerBowlingFigures(team2.getCountry(), 7, new BowlingFigures(2, 0, 15));
	 // System.out.println(c);
	  System.out.println(c.getTeam1().getScoreBoard(ScorecardType.BATTING));
	  
	 
  }

private static Team createTeam(Country country) {
	Team team = new Team(country);
	  IntStream.range(0, 3).forEach(i->{
		  Player p = new PlayerFactory(PlayerType.BATSMAN).createPlayerByType();
		  p.setName("Batsman"+i);
		  p.setBattingStyle("RightHanded");
		  p.setBowlingStyle("rightHanded");
		  team.addPlayer(p);
	  });
	  IntStream.range(3, 5).forEach(i->{
		  Player p = new PlayerFactory(PlayerType.ALROUNDER).createPlayerByType();
		  p.setName("Allrounder"+i);
		  p.setBattingStyle("LeftHanded");
		  p.setBowlingStyle("rightHanded");
		  team.addPlayer(p);
	  });
	  IntStream.range(5, 6).forEach(i->{
		  Player p = new PlayerFactory(PlayerType.WICKETKEEPER).createPlayerByType();
		  p.setName("Wicketkeeper"+i);
		  p.setBattingStyle("LeftHanded");
		  p.setBowlingStyle("rightHanded");
		  team.addPlayer(p);
	  });
	  IntStream.range(6, 11).forEach(i->{
		  Player p = new PlayerFactory(PlayerType.BOWLER).createPlayerByType();
		  p.setName("Bowler"+i);
		  p.setBattingStyle("LeftHanded");
		  p.setBowlingStyle("rightHanded");
		  team.addPlayer(p);
	  });
	  return team;
}
  	  
}
