package openEngine;

import program.EntTest;
import program.ProgramDriver;
import program.objectsBundle.garbage.Ent;
import program.objectsBundle.garbage.GameObject;
import program.objectsBundle.garbage.InventoryItem;
import program.objectsBundle.garbage.Stat;
import program.objectsBundle.garbage.ThingFactory;

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
		String test = OpCrypter.cryptString(thread.toString());
		System.out.println(test);
		System.out.println(OpCrypter.decryptString(test));
		//EntTest test = new EntTest();
	}
}
