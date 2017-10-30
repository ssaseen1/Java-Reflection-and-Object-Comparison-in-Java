package genericSerDeser.util;

import genericSerDeser.util.Logger.DebugLevel;

/**
 * 
 * @author shali
 * This class's instance is created using reflection
 */
public class First{
	
	private boolean BooleanValue;
	private byte ByteValue;
	private char CharValue;
	private double DoubleValue;
	private float FloatValue;
	private int IntValue;
	private long LongValue;
	private short ShortValue;
	private String StringValue;
	
	/**
	 * Constructor with no parameters
	 */
	public First(){
		
    	Logger.writeMessage("Constructor called: First class ",DebugLevel.CONSTRUCTOR);
		BooleanValue = false;
		ByteValue = 0;
		CharValue = ' ';
		DoubleValue = 0;
		FloatValue = 0;
		IntValue = 0;
		LongValue = 0;
		ShortValue = 0;
		StringValue = "";
		
	}
	

	/**
	 * @return the byteValue
	 */
	public byte getByteValue() {
		return ByteValue;
	}

	/**
	 * @return the shortValue
	 */
	public short getShortValue() {
		return ShortValue;
	}

	/**
	 * @return the intValue
	 */
	public int getIntValue() {
		return IntValue;
	}

	/**
	 * @return the longValue
	 */
	public long getLongValue() {
		return LongValue;
	}

	/**
	 * @return the floatValue
	 */
	public float getFloatValue() {
		return FloatValue;
	}

	/**
	 * @return the doubleValue
	 */
	public double getDoubleValue() {
		return DoubleValue;
	}

	/**
	 * @return the booleanValue
	 */
	public boolean getBooleanValue() {
		return BooleanValue;
	}

	/**
	 * @return the charValue
	 */
	public char getCharValue() {
		return CharValue;
	}

	/**
	 * @return the stringValue
	 */
	public String getStringValue() {
		return StringValue;
	}

	/**
	 * @param byteValue the byteValue to set
	 */
	public void setByteValue(byte byteValue) {
		ByteValue = byteValue;
	}

	/**
	 * @param shortValue the shortValue to set
	 */
	public void setShortValue(short shortValue) {
		ShortValue = shortValue;
	}

	/**
	 * @param intValue the intValue to set
	 */
	public void setIntValue(int intValue) {
		IntValue = intValue;
	}

	/**
	 * @param longValue the longValue to set
	 */
	public void setLongValue(long longValue) {
		LongValue = longValue;
	}

	/**
	 * @param floatValue the floatValue to set
	 */
	public void setFloatValue(float floatValue) {
		FloatValue = floatValue;
	}

	/**
	 * @param doubleValue the doubleValue to set
	 */
	public void setDoubleValue(double doubleValue) {
		DoubleValue = doubleValue;
	}

	/**
	 * @param booleanValue the booleanValue to set
	 */
	public void setBooleanValue(boolean booleanValue) {
		BooleanValue = booleanValue;
	}

	/**
	 * @param charValue the charValue to set
	 */
	public void setCharValue(char charValue) {
		CharValue = charValue;
	}

	/**
	 * @param stringValue the stringValue to set
	 */
	public void setStringValue(String stringValue) {
		StringValue = stringValue;
	}

	/**
	 * @return int
	 * @param none
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (BooleanValue ? 1231 : 1237);
		result = prime * result + ByteValue;
		result = prime * result + CharValue;
		long temp;
		temp = Double.doubleToLongBits(DoubleValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(FloatValue);
		result = prime * result + IntValue;
		result = prime * result + (int) (LongValue ^ (LongValue >>> 32));
		result = prime * result + ShortValue;
		result = prime * result + ((StringValue == null) ? 0 : StringValue.hashCode());
		return result;
	}

	/**
	 * @return boolean
	 * @param none
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof First))
			return false;
		First other = (First) obj;
		if (BooleanValue != other.BooleanValue)
			return false;
		if (ByteValue != other.ByteValue)
			return false;
		if (CharValue != other.CharValue)
			return false;
		if (Double.doubleToLongBits(DoubleValue) != Double.doubleToLongBits(other.DoubleValue))
			return false;
		if (Float.floatToIntBits(FloatValue) != Float.floatToIntBits(other.FloatValue))
			return false;
		if (IntValue != other.IntValue)
			return false;
		if (LongValue != other.LongValue)
			return false;
		if (ShortValue != other.ShortValue)
			return false;
		if (StringValue == null) {
			if (other.StringValue != null)
				return false;
		} else if (!StringValue.equals(other.StringValue))
			return false;
		return true;
	}

	/**
	 * @return String
	 */
	@Override
	public String toString() {
		return "First [ByteValue=" + ByteValue + ", ShortValue=" + ShortValue + ", IntValue=" + IntValue
				+ ", LongValue=" + LongValue + ", FloatValue=" + FloatValue + ", DoubleValue=" + DoubleValue
				+ ", BooleanValue=" + BooleanValue + ", CharValue=" + CharValue + ", StringValue=" + StringValue + "]";
	}

	
}
