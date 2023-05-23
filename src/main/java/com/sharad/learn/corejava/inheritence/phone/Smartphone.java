package com.sharad.learn.corejava.inheritence.phone;
public class Smartphone extends BasicPhone{
	private  MediaPlayer mediaPlayer; 
	private  FMRadio fmRadio;
	private Camera camera;
	public FMRadio getFmRadio() {
		return fmRadio;
	}
	public MediaPlayer getMediaPlayer() {
		return mediaPlayer;
	}
	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}
	
	public Smartphone(Model model) {
		super(model, KeypadType.TOUCHPAD);
		this.setDeafultFeatures();
	}
	private void setDeafultFeatures() {
		this.setDataEnabled(Boolean.TRUE);
		this.setHasBlueTooth(Boolean.TRUE);
		this.setHasInfraRed(Boolean.FALSE);
		this.setHasWifi(Boolean.TRUE);
		this.setHasMusicPlayer(Boolean.TRUE);
		this.setHasTouchScreen(Boolean.TRUE);
		this.setHasRadio(Boolean.TRUE);
		this.setHasCamera(Boolean.TRUE);
		this.fmRadio = new FMRadio();
		this.camera = new Camera();
	}
	public Camera getCamera() {
		return camera;
	}
	public void makeVideoCall(String number) {
		System.out.println("Making Video call to "+number);
	}
	@Override
	public String toString() {
		return "Smartphone [mediaPlayer=" + mediaPlayer + ", fmRadio=" + fmRadio + ", camera=" + camera + "]";
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
		.append("media Player: ").append(this.getMediaPlayer()).append("\n")
		.append("camera: ").append(this.getCamera()).append("\n")
		.append("]");
		System.out.println(sb.toString());
	}
	

}
