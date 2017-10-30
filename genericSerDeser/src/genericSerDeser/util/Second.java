package genericSerDeser.util;

import genericSerDeser.util.Logger.DebugLevel;

/**
 * 
 * @author shali
 * This class's instance is created using reflection
 */
public class Second {
	
	private double DoubleValue;
	private double DoubleValue2;
	private long LongValue;
	private long LongValue2;
	private short ShortValue;
	private short ShortValue2;
	private String StringValue;
	
	/**
	 * Constructor with no parameters
	 */
	public Second(){
		Logger.writeMessage("Constructor called: Second class ",DebugLevel.CONSTRUCTOR);
	
		DoubleValue = 0;
		DoubleValue2 = 0;
		LongValue = 0;
		LongValue2 = 0;
		ShortValue = 0;
		ShortValue2 = 0;
		StringValue = "";
	}

	/**
	 * @return the shortValue2
	 */
	public short getShortValue2() {
		return ShortValue2;
	}

	/**
	 * @return the shortValue
	 */
	public short getShortValue() {
		return ShortValue;
	}

	/**
	 * @return the longValue
	 */
	public long getLongValue() {
		return LongValue;
	}

	/**
	 * @return the longValue2
	 */
	public long getLongValue2() {
		return LongValue2;
	}

	/**
	 * @return the doubleValue
	 */
	public double getDoubleValue() {
		return DoubleValue;
	}

	/**
	 * @return the doubleValue2
	 */
	public double getDoubleValue2() {
		return DoubleValue2;
	}

	/**
	 * @return the stringValue
	 */
	public String getStringValue() {
		return StringValue;
	}

	/**
	 * @return void
	 * @param shortValue2
	 */
	public void setShortValue2(short shortValue2) {
		ShortValue2 = shortValue2;
	}

	/**
	 * @return void
	 * @param shortValue
	 */
	public void setShortValue(short shortValue) {
		ShortValue = shortValue;
	}

	/**
	 * @return void
	 * @param longValue
	 */
	public void setLongValue(long longValue) {
		LongValue = longValue;
	}

	/**
	 * @return void
	 * @param longValue2
	 */
	public void setLongValue2(long longValue2) {
		LongValue2 = longValue2;
	}

	/**
	 * @return void
	 * @param doubleValue
	 */
	public void setDoubleValue(double doubleValue) {
		DoubleValue = doubleValue;
	}

	/**
	 * @return void
	 * @param doubleValue2
	 */
	public void setDoubleValue2(double doubleValue2) {
		DoubleValue2 = doubleValue2;
	}

	/**
	 * @return void
	 * @param stringValue
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
		long temp;
		temp = Double.doubleToLongBits(DoubleValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(DoubleValue2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (LongValue ^ (LongValue >>> 32));
		result = prime * result + (int) (LongValue2 ^ (LongValue2 >>> 32));
		result = prime * result + ShortValue;
		result = prime * result + ShortValue2;
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
		if (getClass() != obj.getClass())
			return false;
		Second other = (Second) obj;
		if (Double.doubleToLongBits(DoubleValue) != Double.doubleToLongBits(other.DoubleValue))
			return false;
		if (Double.doubleToLongBits(DoubleValue2) != Double.doubleToLongBits(other.DoubleValue2))
			return false;
		if (LongValue != other.LongValue)
			return false;
		if (LongValue2 != other.LongValue2)
			return false;
		if (ShortValue != other.ShortValue)
			return false;
		if (ShortValue2 != other.ShortValue2)
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
		return "Second [ShortValue2=" + ShortValue2 + ", ShortValue=" + ShortValue + ", LongValue=" + LongValue
				+ ", LongValue2=" + LongValue2 + ", DoubleValue=" + DoubleValue + ", DoubleValue2=" + DoubleValue2
				+ ", StringValue=" + StringValue + "]";
	}
	
	
	
}
