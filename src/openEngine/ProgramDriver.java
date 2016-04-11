package openEngine;
/**
 * This Class serves as the core program-driver when using open engine.
 * MainThread calls ProgramDriver's update ever DEFAULT_MS
 * ProgramDriver holds a reference to MainFrame to be used however the program needs
 * 
 * @author A.Audette
 * @version 1
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Line2D;
public class ProgramDriver {
	MainFrame frame;
	/**
	 * Default constructor, accepts a MainFrame parameter and sets it as a field in this class
	 * @param MainFrame - the frame to be set
	 */
	public ProgramDriver(MainFrame frame){
		frame = this.frame;
	}
	/**
	 * The update method to be called by MainThread
	 */
	public void update(){

	}
}
