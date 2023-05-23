package com.sharad.learn.corejava.sample.cricket;

import java.io.Serializable;

public class Player implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4093142653322728582L;
	private String name;
	private PlayerType playerType;
	private String battingStyle;
	private String bowlingStyle;
	private BattingFigures battingFigures;
	private BowlingFigures bowlingFigures;
	public Player(PlayerType playerType) {
		super();
		this.playerType = playerType;
		this.battingFigures=new BattingFigures(0d, 0d, 0, 0);
		this.bowlingFigures=new BowlingFigures(0d, 0d, 0d);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBattingStyle() {
		return battingStyle;
	}
	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}
	
	public String getBowlingStyle() {
		return bowlingStyle;
	}
	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	
	
	public BattingFigures getBattingFigures() {
		return battingFigures;
	}
	public void setBattingFigures(BattingFigures battingFigures) {
		this.battingFigures = battingFigures;
	}
	public BowlingFigures getBowlingFigures() {
		return bowlingFigures;
	}
	public void setBowlingFigures(BowlingFigures bowlingFigures) {
		this.bowlingFigures = bowlingFigures;
	}
	@Override
	public String toString() {
		return "\n\tPlayer [name=" + name + ", playerType=" + playerType + ", battingStyle=" + battingStyle
				+ ", bowlingStyle=" + bowlingStyle + ", \n\t battingFigures=" + battingFigures + ", \n\t bowlingFigures="
				+ bowlingFigures + "]\n";
	}
	
}
