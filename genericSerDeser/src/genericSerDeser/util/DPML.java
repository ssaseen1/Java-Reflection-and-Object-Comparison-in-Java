package genericSerDeser.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import genericSerDeser.fileOperations.FileDisplayInterface;
import genericSerDeser.strategy.SerStrategy;
import genericSerDeser.util.Logger.DebugLevel;

/**
 * 
 * @author shali
 * This Class implements serialisation
 */
public class DPML implements SerStrategy{
	
	StringBuilder strBuilder = null;
	FileDisplayInterface fileProcessor = null;
	
	/**
	 * Constructor
	 * @param fileProcessorIn
	 */
	public DPML(FileDisplayInterface fileProcessorIn) {
		// TODO Auto-generated constructor stub
    	Logger.writeMessage("Constructor called: DPML class", DebugLevel.CONSTRUCTOR);
		fileProcessor = fileProcessorIn;
	}
	
	/**
	 * @param Object
	 * @return void
	 * 
	 */
	@Override
	public void createDPMLFormat(Object obj) {
		// TODO Auto-generated method stub
		Logger.writeMessage("Serialization ", DebugLevel.SERIALIZE);
		strBuilder = new StringBuilder();
		Class<?> cls = null;
		Method method = null;
		strBuilder.append("<fqn:"+obj.getClass().getCanonicalName()+">\n");
		cls = obj.getClass();
		Field fields[] = cls.getDeclaredFields();
		
		for(Field each: fields){
			try {
				String var = each.getName();
				method = cls.getMethod("get"+var);
				Object returnValue = method.invoke(obj);
				if(each.getType() == Integer.TYPE){
					int value = Integer.parseInt(returnValue.toString());
					strBuilder.append("<type="+each.getType()+", var="+var+", value="+value+">\n");					
				}
				else if(each.getType() == Float.TYPE){
					float value = Float.parseFloat(returnValue.toString());
					strBuilder.append("<type="+each.getType()+", var="+var+", value="+value+">\n");
				}
				else if (each.getType() == Double.TYPE){
					double value = Double.parseDouble(returnValue.toString());
					strBuilder.append("<type="+each.getType()+", var="+var+", value="+value+">\n");	
				}
				else if (each.getType() == Short.TYPE){
					short value = Short.parseShort(returnValue.toString());
					strBuilder.append("<type="+each.getType()+", var="+var+", value="+value+">\n");
				}
				else if (each.getType() == Long.TYPE){
					long value = Long.parseLong(returnValue.toString());
					strBuilder.append("<type="+each.getType()+", var="+var+", value="+value+">\n");
				}
				else if (each.getType() == Boolean.TYPE){
					boolean value = Boolean.parseBoolean(returnValue.toString());
					strBuilder.append("<type="+each.getType()+", var="+var+", value="+value+">\n");
				}
				else if (each.getType() == Character.TYPE){
					char value = returnValue.toString().charAt(0);
					strBuilder.append("<type="+each.getType()+", var="+var+", value="+value+">\n");
				}
				else {
					String value = returnValue.toString();
					strBuilder.append("<type="+each.getType().getSimpleName()+", var="+var+", value="+value+">\n");
				}
				
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				System.err.println("Method not found");
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				System.err.println("Voilation in Security");
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				System.err.println("Illegal Access Axception");
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				System.err.println("Illegal Argument Exception");
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				System.err.println("Invocation Target Exception");
				e.printStackTrace();
			}		
			
		}
		
		strBuilder.append("</fqn:"+obj.getClass().getCanonicalName()+">\n");
		fileProcessor.writeToFile(strBuilder.toString());
		
	}
}
