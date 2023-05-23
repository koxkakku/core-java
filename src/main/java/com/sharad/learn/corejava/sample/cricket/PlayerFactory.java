package com.sharad.learn.corejava.sample.cricket;

public class PlayerFactory {
	private PlayerType playerType;

	public PlayerFactory(PlayerType playerType) {
		super();
		this.playerType = playerType;
	}

	public Player createPlayerByType() {
		Player p = null;
		switch (this.playerType) {
		case BATSMAN:
			p = new Batsman();
			break;
		case BOWLER:
			p = new Bowler();
			break;
		case ALROUNDER:
			p = new Allrounder();
			break;
		case WICKETKEEPER:
			p= new Wicketkeeper();
			break;
		}
		return p;
	}
}
