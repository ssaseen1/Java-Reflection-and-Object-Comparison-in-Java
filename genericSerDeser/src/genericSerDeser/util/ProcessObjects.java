package genericSerDeser.util;

import genericSerDeser.strategy.SerStrategy;
import genericSerDeser.util.Logger.DebugLevel;

/**
 * 
 * @author shali
 * Class calls the strategy method.
 */
public class ProcessObjects {
	
	/**
	 * Constructor
	 */
	public ProcessObjects() {
		// TODO Auto-generated constructor stub
		Logger.writeMessage("Constructor called: ProcessObjects class ",DebugLevel.CONSTRUCTOR);
	}
	
	/**
	 * 
	 * @param obj
	 * @param strategy
	 */
	public void processObject (Object obj, SerStrategy strategy){
		
		strategy.createDPMLFormat(obj);
		
	}
	

}
