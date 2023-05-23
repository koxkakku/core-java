/**
 * 
 */
package com.sharad.learn.corejava.sample.cricket;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Koxkakku
 *
 */
public class Team implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3956672451494228219L;
	private Country country;
	private List<Player> players;
	private double score;
	private double runRate;
	private boolean isWinner;
	public Team(Country country) {
		super();
		this.players = new ArrayList<>(11);
		this.country = country;
	}
	public double getScore() {
		return this.players.stream().filter(Objects::nonNull).mapToDouble(p->p.getBattingFigures().getRunsScored()).sum();
	}
	
	public double getRunRate() {
		double bowlsPlayed = this.players.stream().filter(Objects::nonNull).mapToDouble(p->p.getBattingFigures().getBowlsConsumed()).sum();
		return this.score/(bowlsPlayed/6);
	}

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	
	public List<Player> getPlayers() {
		return players;
	}
	public void addPlayer(Player players) {
		this.players.add(players);
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}

	public Scoreboard getScoreBoard(ScorecardType scorecardType) {
		Scoreboard sb= new Scoreboard();
		List<Scorecard> scorecard = this.players.stream().map(p-> new ScorecardFactory(scorecardType).getScoreCard(p.getName(), p.getBattingFigures())).collect(Collectors.toList());
		sb.setCountry(this.country);
		sb.setScorecard(scorecard);
		return sb;
	}
	@Override
	public String toString() {
		return "Team [country=" + country + ",\n\t players=" + players + ", \n\t score=" + score + ", runRate=" + runRate
				+ ", isWinner=" + isWinner + "]\n";
	}
	
	
	
}
