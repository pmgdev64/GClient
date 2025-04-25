package gclient;

import org.lwjgl.opengl.Display;

import gclient.gui.GClientSplashScreen;

public class Client {
    public String name = "Gclient ";
    public String version = "1.8.9 ";
    public String build = "Build 1030";
	public static Client INSTANCE = new Client();
	
	
	public void startup() {
		GClientSplashScreen.setProgress(1, "GClient -Initializing");
		Display.setTitle(name + version + build); 
	}
	
	public void shutdown() {
		
	}
}
