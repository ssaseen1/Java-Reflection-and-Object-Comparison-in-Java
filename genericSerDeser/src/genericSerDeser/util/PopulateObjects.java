package genericSerDeser.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import genericSerDeser.fileOperations.FileDisplayInterface;
import genericSerDeser.strategy.SerStrategy;
import genericSerDeser.util.Logger.DebugLevel;

/**
 * 
 * @author shali
 * This class is used to deserialize the objects.
 */
public class PopulateObjects implements PopulateObjectsInterface {
		
	private List<Object> listOfObjects = null;	
	private FileDisplayInterface fileProcessor = null;
	private SerStrategy serObj = null;
	
	/**
	 * Constructor 
	 * @param fileProcessorIn
	 *      
	 */
	public PopulateObjects(FileDisplayInterface fileProcessorIn) {
		// TODO Auto-generated constructor stub
		Logger.writeMessage("Constructor called: PopulateObjects class ",DebugLevel.CONSTRUCTOR);
		fileProcessor = fileProcessorIn;
		listOfObjects = new ArrayList<>();	
	}

	/**
	 * @return the listOfObjects
	 */
	public List<Object> getListOfObjects() {
		return listOfObjects;
	}

	/**
	 * @param listOfObjects the listOfObjects to set
	 */
	public void setListOfObjects(List<Object> listOfObjects) {
		this.listOfObjects = listOfObjects;
	}

	/**
	 *  @return void
	 *  @param none 
	 *  Method used to read the line and creating object
	 */
	public void deserObjects(){
		
		String fileInput = null;	
		fileInput = fileProcessor.readFromFile();
		String[] token = null;
		String clsName = null;
		Class<?> cls = null;
		String methodName = null;
		Method method = null;
		Object obj = null;
		while(null != fileInput){
			
			/**
			 * remove all white spaces
			 */
			fileInput = fileInput.replaceAll("\\s+","");
			if(fileInput.contains("<fqn:")){

				token = fileInput.split(":");
				clsName = token[1].substring(0, token[1].length() - 1); 
				try {
					cls = Class.forName(clsName); 
					obj = cls.newInstance();
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println("Class not found");
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					System.err.println("Cannot be instantiated");
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					System.err.println("Illegal Access to the class found");
					e.printStackTrace();
				} 
				
			}
			if (fileInput.contains("<type=")){
				
				token = fileInput.split(",", 3);
				String[] type = token[0].split("=");
				String[] var = token[1].split("=");
				String[] value = token[2].split("=");
				
				value[1] = value[1].substring(0, value[1].length()-1);
				
				try {	
					methodName = "set" + var[1]; 
					
					if(type[1].equals("int")){
						method = cls.getMethod(methodName, Integer.TYPE);
						method.invoke(obj, Integer.parseInt(value[1]));
					}
					
					else if(type[1].equals("float")){
						method = cls.getMethod(methodName, Float.TYPE);	
						method.invoke(obj, Float.parseFloat(value[1]));
					}
					
					else if(type[1].equals("long")){
						method = cls.getMethod(methodName, Long.TYPE);	
						method.invoke(obj, Long.parseLong(value[1]));
					}
					
					else if(type[1].equals("short")){
						method = cls.getMethod(methodName, Short.TYPE);	
						method.invoke(obj, Short.parseShort(value[1]));
					}
					
					else if(type[1].equals("double")){
						method = cls.getMethod(methodName, Double.TYPE);
						method.invoke(obj, Double.parseDouble(value[1]));
					}
					
					else if(type[1].equals("boolean")){
						method = cls.getMethod(methodName, Boolean.TYPE);
						method.invoke(obj, Boolean.parseBoolean(value[1]));
					}
					
					else if(type[1].equals("char")){
						method = cls.getMethod(methodName, Character.TYPE);
						if(value.length > 1)
							method.invoke(obj, value[1].charAt(0));
					}
					
					else if(type[1].equals("byte")){
						method = cls.getMethod(methodName, Byte.TYPE);	
						method.invoke(obj, Byte.parseByte(value[1]));
					}
					
					else{
						method = cls.getMethod(methodName, String.class);
						if(value.length > 1)
							method.invoke(obj, value[1]);
					}
					
				} catch (IllegalAccessException  e) {
					// TODO Auto-generated catch block
					System.err.println("Illegal access to the method");
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					System.err.println("Illegal arguments in the method");
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					System.err.println("Invocation target exception");
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					System.err.println("No such method found");
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					System.err.println("Security violation detected ");
					e.printStackTrace();
				}	
			}
			
			if(fileInput.contains("</fqn:")){
				Logger.writeMessage("Deserialization ", DebugLevel.DESERIALIZE);
				listOfObjects.add((Object) obj);
			}
			fileInput = fileProcessor.readFromFile();
		}
		
		Logger.writeMessage(listOfObjects.size()+ " objects are deserialized and serialized", DebugLevel.DATASTRUCTURE);

	}
	
	/**
	 * 
	 * @return String
	 * Method for printing the objects in the data structure
	 */
	public String iterateListPrint(){
		Iterator<Object> itr =  listOfObjects.iterator();
		StringBuilder str = new StringBuilder("");
		while(itr.hasNext()){
			str.append(itr.next().toString());
			str.append("\n");
		}
		return str.toString();
	}	
	
	/**
	 * @return String
	 */
	public String toString(){
		return "Driver Class";
	}

}
