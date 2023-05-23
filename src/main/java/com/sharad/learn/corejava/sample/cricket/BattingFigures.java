package com.sharad.learn.corejava.sample.cricket;

public class BattingFigures{

	private double runsScored;
	private double bowlsConsumed;
	private int sixes;
	private int fours;
	private double strikeRate;
	
	public double getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(double runsScored) {
		this.runsScored = runsScored;
	}
	public double getBowlsConsumed() {
		return bowlsConsumed;
	}
	public void setBowlsConsumed(double bowlsConsumed) {
		this.bowlsConsumed = bowlsConsumed;
	}
	public int getSixes() {
		return sixes;
	}
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	public int getFours() {
		return fours;
	}
	public void setFours(int fours) {
		this.fours = fours;
	}
	public double getStrikeRate() {
		return this.strikeRate;
	}
	public void setStrikeRate(double strikeRate) {
		this.strikeRate = strikeRate;
	}
	public BattingFigures(double runsScored, double bowlsConsumed, int sixes, int fours) {
		super();
		this.runsScored = runsScored;
		this.bowlsConsumed = bowlsConsumed;
		this.sixes = sixes;
		this.fours = fours;
		this.strikeRate=0d!=this.bowlsConsumed? this.runsScored/this.bowlsConsumed*100: this.strikeRate*100;
	}
	@Override
	public String toString() {
		return "BattingFigures [runsScored=" + runsScored + ", bowlsConsumed=" + bowlsConsumed + ", sixes=" + sixes
				+ ", fours=" + fours + ", strikeRate=" + strikeRate + "]";
	}
}
