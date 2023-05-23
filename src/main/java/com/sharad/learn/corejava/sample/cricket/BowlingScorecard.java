package com.sharad.learn.corejava.sample.cricket;

public class BowlingScorecard extends Scorecard {
	private BowlingFigures bowlingFigures;
	@Override
	public String toString() {
		return "BowlingScorecard [bowlingFigures=" + bowlingFigures + "]";
	}
	public BowlingFigures getBowlingFigures() {
		return bowlingFigures;
	}
	public void setBowlingFigures(BowlingFigures bowlingFigures) {
		this.bowlingFigures = bowlingFigures;
	}
	public BowlingScorecard(String playerName,BowlingFigures bowlingFigures) {
		super(ScorecardType.BOWLING,playerName);
		this.bowlingFigures= bowlingFigures;
	}

}
