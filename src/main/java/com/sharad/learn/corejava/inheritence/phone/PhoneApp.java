package com.sharad.learn.corejava.inheritence.phone;

public class PhoneApp {
	public static void main(String[]args) {
		
		//smartphone
		Smartphone sp=new Smartphone(new Model("1224-2345-3456", "Samsung", "S20"));
		sp.setMediaPlayer(new MediaPlayer("Altac Lancing", "1000W", "Dolby"));
		sp.describe();
		
		sp.getFmRadio().play();
		sp.getFmRadio().stop();
		sp.getFmRadio().close();
		sp.getMediaPlayer().play();
		sp.getMediaPlayer().forward();
		sp.getMediaPlayer().pause();
		sp.getMediaPlayer().stop();
		sp.getMediaPlayer().record();
		sp.getMediaPlayer().stopRecording();
		sp.getMediaPlayer().close();
		
		sp.getCamera().click();
		sp.getCamera().record();
		sp.makeVoiceCall("9007416387");
		sp.makeVideoCall("9007416387");
		
		
	}

}
