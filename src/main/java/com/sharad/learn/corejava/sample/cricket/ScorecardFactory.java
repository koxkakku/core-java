package com.sharad.learn.corejava.sample.cricket;

public class ScorecardFactory {

	private ScorecardType scorecardType;

	public ScorecardFactory(ScorecardType scorecardType) {
		super();
		this.scorecardType = scorecardType;
	}

	public Scorecard getScoreCard(String playerName,Object stats) {
		Scorecard scorecard = null;
		switch (scorecardType) {
		case BATTING:
			scorecard = new BattingScorecard(playerName,(BattingFigures)stats);
			break;
		case BOWLING:
			scorecard = new BowlingScorecard(playerName,(BowlingFigures)stats);
			break;
		}
		return scorecard;
	}
}
