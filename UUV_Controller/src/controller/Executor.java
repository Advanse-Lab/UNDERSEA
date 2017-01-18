package controller;

public abstract class Executor {

	public Executor() {
	}

	/** Construct command:
	 *  it should be in the form: SPEED=xx.xx,SENSOR1=x,SENSOR2=x,....
	 */
	public abstract void run();
	
	
	/** Get the command: 
	 *  it should be in the form: SPEED=xx.xx,SENSOR1=x,SENSOR2=x,....
	 * */
	public abstract String getCommand();
}
