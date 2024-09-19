public class ImplicitTypeCasting {

	    public static void main(String[] args) {
	        // Implicit conversion from byte to int
	        byte byteValue = 42;
	        int intValue = byteValue;  // byte is promoted to int automatically

	        // Implicit conversion from short to int
	        short shortValue = 1000;
	        int anotherIntValue = shortValue;  // short is promoted to int automatically

	        // Implicit conversion from char to int
	        char charValue = 'A';  // 'A' has ASCII value 65
	        int charAsInt = charValue;  // char is promoted to int automatically

	        // Implicit conversion from int to long
	        long longValue = intValue;  // int is promoted to long automatically

	        // Implicit conversion from long to float
	        float floatValue = longValue;  // long is promoted to float automatically

	        // Implicit conversion from float to double
	        double doubleValue = floatValue;  // float is promoted to double automatically

	        // Display the results
	        System.out.println("Byte value: " + byteValue);
	        System.out.println("Converted to int: " + intValue);
	        System.out.println("Short value: " + shortValue);
	        System.out.println("Converted to int: " + anotherIntValue);
	        System.out.println("Char value: " + charValue + " (ASCII: " + (int)charValue + ")");
	        System.out.println("Converted to int: " + charAsInt);
	        System.out.println("Int value: " + intValue);
	        System.out.println("Converted to long: " + longValue);
	        System.out.println("Long value: " + longValue);
	        System.out.println("Converted to float: " + floatValue);
	        System.out.println("Float value: " + floatValue);
	        System.out.println("Converted to double: " + doubleValue);
	    }
	



}
