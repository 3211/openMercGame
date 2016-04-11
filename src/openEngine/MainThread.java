package openEngine;

import program.ProgramDriver;

/**
 * A simple template for a functioning thread to call programDriver's ''update'' method.
 * 
 * @author A.Audette
 * @version 1
 */
public class MainThread{
	ProgramDriver programDriver;
	public static final int DEFAULT_MS = 256;
	private boolean clockRunning;
	private CoreThread coreThread;
	/**
	 * default constructor, initialises everything and starts the thread. 
	 * @param programDriver
	 */
    public MainThread(ProgramDriver programDriver) {
		if(programDriver != null){
			this.programDriver = programDriver;
		} else {
			programDriver = new ProgramDriver(new MainFrame());
		}
		startClock(true);
	}
    /**
     * calls programDriver's update method
     */
    public void update(){
		programDriver.update();
	}
    /**
     * the custom thread itself
     */
    private class CoreThread extends Thread    {
		public void run()        {
            while (clockRunning) {
                update();
                pause();
            }        
        } 
        private void pause()
        {
            try {
                Thread.sleep(DEFAULT_MS);   // pause for variable milliseconds
            }
            catch (InterruptedException exc) {
            }        
        }  
        
    }
    /**
     * simple method to start or stop the main thread
     * @param runClock - false = stop, true = start
     */
    public void startClock(boolean runClock){
        if (runClock == true){
            start();
        }else{
            stop();
        }
    }
    /**
     * starts the thread
     */
    private void start()
    {
        clockRunning = true;
        coreThread = new CoreThread();
        coreThread.start();
    }
    /**
     * stops the thread
     */
    private void stop(){
        clockRunning = false;
    }

}