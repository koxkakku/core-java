package com.sharad.learn.corejava.sample.cricket;

import java.util.List;

public class Scoreboard {
	private Country country;
	private List<Scorecard> scorecard;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public List<Scorecard> getScorecard() {
		return scorecard;
	}
	public void setScorecard(List<Scorecard> scorecard) {
		this.scorecard = scorecard;
	}
	@Override
	public String toString() {
		return "Scoreboard \n\t[country=" + country + ", \n\tscorecard=" + scorecard + "]";
	} 
	
}
