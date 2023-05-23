/**
 * 
 */
package com.sharad.learn.corejava.inheritence.phone;

/**
 * @author koxkakku
 *
 */
public class FeaturePhone extends BasicPhone {
	private  MusicPlayer musicPlayer; 
	private  FMRadio fmRadio;
	public FeaturePhone(Model model) {
		super(model,KeypadType.KEYPAD);
		this.setDeafultFeatures();
	}
	private void setDeafultFeatures() {
		this.setDataEnabled(Boolean.FALSE);
		this.setHasBlueTooth(Boolean.TRUE);
		this.setHasInfraRed(Boolean.TRUE);
		this.setHasWifi(Boolean.FALSE);
		this.setHasMusicPlayer(Boolean.TRUE);
		this.setHasTouchScreen(Boolean.FALSE);
		this.setHasRadio(Boolean.TRUE);
		this.setHasCamera(Boolean.FALSE);
		this.fmRadio = new FMRadio();
	}
	public MusicPlayer getMusicPlayer() {
		return musicPlayer;
	}
	public void setMusicPlayer(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}
	public FMRadio getFmRadio() {
		return fmRadio;
	}
	@Override
	public String toString() {
		return "FeaturePhone [musicPlayer=" + musicPlayer + ", fmRadio=" + fmRadio + "]";
	}
	@Override
	public void describe() {
		StringBuilder sb = new StringBuilder();
		sb.append("SmartPhone[")
		.append("model: ").append(this.getModel()).append("\n")
		.append("hasRadio: ").append(this.isHasRadio()).append("\n")
		.append("hasBlueTooth: ").append(this.isHasBlueTooth()).append("\n")
		.append("hasMusicPlayer: ").append(this.isHasMusicPlayer()).append("\n")
		.append("hasTouchScreen: ").append(this.isHasTouchScreen()).append("\n")
		.append("isDataEnabled: ").append(this.isDataEnabled()).append("\n")
		.append("hasCamera: ").append(this.isHasCamera()).append("\n")
		.append("keyPadType: ").append(this.getKeyPadType()).append("\n")
		.append("radio player: ").append(this.getFmRadio()).append("\n")
		.append("music Player: ").append(this.getMusicPlayer()).append("\n")
		.append("]");
		System.out.println(sb.toString());
	}
	
}
