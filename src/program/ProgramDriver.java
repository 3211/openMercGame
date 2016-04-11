package program;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import openEngine.MainFrame;
import testClasses.ImageDisplay;
import resPkg.ResourceLoader;

/**
 * @author A.Audette
 * @version 1
 */
public class ProgramDriver {
	MainFrame frame;
	
	public ProgramDriver(MainFrame frame){
		this.frame = frame;
		Image i = ResourceLoader.getImage("test.png");
		frame.setBounds(0,0,i.getWidth(null),i.getHeight(null));
		frame.getCanvasGraphics().drawImage(i, 0, 0, null);
	}

	public void update(){

	}
}
