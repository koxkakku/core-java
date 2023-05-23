package com.sharad.learn.corejava.sample.cricket;

public class BowlingFigures {
	private double oversBowled;
	private double wicketsTaken;
	private double runsGiven;
	private double economy;
	
	public BowlingFigures(double oversBowled, double wicketsTaken, double runsGiven) {
		super();
		this.oversBowled = oversBowled;
		this.wicketsTaken = wicketsTaken;
		this.runsGiven = runsGiven;
		this.economy=0d!=this.oversBowled? this.runsGiven/this.oversBowled: this.economy;
	}
	public double getOversBowled() {
		return oversBowled;
	}
	public void setOversBowled(double oversBowled) {
		this.oversBowled = oversBowled;
	}
	public double getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(double wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	public double getRunsGiven() {
		return runsGiven;
	}
	public void setRunsGiven(double runsGiven) {
		this.runsGiven = runsGiven;
	}
	public double getEconomy() {
		return this.economy;
	}
	public void setEconomy(double economy) {
		this.economy = economy;
	}
	@Override
	public String toString() {
		return "BowlingFigures [oversBowled=" + oversBowled + ", wicketsTaken=" + wicketsTaken + ", runsGiven="
				+ runsGiven + ", economy=" + economy + "]";
	}
}
