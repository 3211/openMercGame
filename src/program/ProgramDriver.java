package program;

import java.awt.Image;
import openEngine.MainFrame;
import resPkg.FileLoader;
import resPkg.ImageLoader;

/**
 * @author A.Audette
 * @version 1
 */
public class ProgramDriver {
	MainFrame frame;
	Image i;
	public ProgramDriver(MainFrame frame){
		this.frame = frame;
		i = ImageLoader.getImage("test.png");
		frame.setBounds(0,0,i.getWidth(null),i.getHeight(null));
		frame.getCanvasGraphics().drawImage(i, 0, 0, null);
		//TODO fix FileLoader:
					//String[] test = FileLoader.getFile("testfile");
	}
	public void update(){
	}
}
