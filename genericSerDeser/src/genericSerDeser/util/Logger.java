package genericSerDeser.util;

public class Logger{

	/**
	 * 
	 * @author shali
	 * enum for debug level values
	 */
    public static enum DebugLevel { 
    	OUTPUT, DESERIALIZE, SERIALIZE, DATASTRUCTURE, CONSTRUCTOR
    	};

    private static DebugLevel debugLevel;

    /**
     * method called to set the debug value
     * @param levelIn
     */
    public static void setDebugValue (int levelIn) {
    	switch (levelIn) {
	
    	case 0:
		debugLevel = DebugLevel.OUTPUT;
		break;
    	case 1:
		debugLevel = DebugLevel.DESERIALIZE;
		break;
    	case 2:
		debugLevel = DebugLevel.SERIALIZE;
		break;
    	case 3:
		debugLevel = DebugLevel.DATASTRUCTURE;
		break;
    	case 4:
		debugLevel = DebugLevel.CONSTRUCTOR;
		break;
	  
	}
    }

    /**
     * 
     * @param levelIn
     */
    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    /**
     * static method to write message to the screen
     * @param message
     * @param levelIn
     */
    public static void writeMessage (String message, DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    /**
     * overridden the toString method
     * @return String
     */
    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
