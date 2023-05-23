package com.sharad.learn.corejava.sample.cricket;

public class BattingScorecard extends Scorecard {
	private BattingFigures battingFigures;
	public BattingScorecard(String playerName,BattingFigures battingFigures) {
		super(ScorecardType.BATTING,playerName);
		this.battingFigures= battingFigures;
	}
	public BattingFigures getBattingFigures() {
		return battingFigures;
	}
	public void setBattingFigures(BattingFigures battingFigures) {
		this.battingFigures = battingFigures;
	}
	@Override
	public String toString() {
		return "\nBattingScorecard [battingFigures=" + battingFigures + "]";
	}

}
