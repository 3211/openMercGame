package openEngine;
/**
 * simple launcher for openEngine based programs, causes initialisation of:
 * MainThread, MainFrame and ProgramDriver
 * 
 * @author A.Audette
 * @version 1
 */
public class Launcher {
	private static MainThread thread;
	/**
	 * launcher method
	 * @param String[] - launch arguments
	 */
	public static void main(String[] args){
		thread = new MainThread(new ProgramDriver(new MainFrame()));	
	}
}
