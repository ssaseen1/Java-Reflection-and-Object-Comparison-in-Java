package genericSerDeser.util;

import genericSerDeser.strategy.SerStrategy;

/**
 * 
 * @author shali
 * This interface is implemeted by ProcessObjects
 */
public interface ProcessObjectsInterface {
	public void processObject (Object obj, SerStrategy strategy);
}
