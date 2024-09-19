
public class ExplicitTypeCasting {

	public static void main(String[] args) {
        // Example 1: Casting from int to byte (data truncation)
        int intValue = 260;  // Original integer value
        byte byteValue = (byte) intValue;  // Cast to byte (8 bits)
        System.out.println("Casting int to byte:");
        System.out.println("Original int value: " + intValue);
        System.out.println("Casted byte value: " + byteValue);  // Expected output: 4 (due to overflow)
        System.out.println("------------------------------------------------");

        // Example 2: Casting from double to int (loss of fractional part)
        double doubleValue = 123.456;  // Original double value
        int intFromDouble = (int) doubleValue;  // Cast to int (32 bits)
        System.out.println("Casting double to int:");
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Casted int value: " + intFromDouble);  // Expected output: 123 (fractional part is lost)
        System.out.println("------------------------------------------------");

        // Example 3: Casting from float to int (loss of fractional part)
        float floatValue = 45.78f;  // Original float value
        int intFromFloat = (int) floatValue;  // Cast to int (32 bits)
        System.out.println("Casting float to int:");
        System.out.println("Original float value: " + floatValue);
        System.out.println("Casted int value: " + intFromFloat);  // Expected output: 45 (fractional part is lost)
        System.out.println("------------------------------------------------");

        // Example 4: Casting from long to float (possible loss of precision)
        long longValue = 123456789L;  // Original long value
        float floatFromLong = (float) longValue;  // Cast to float (32 bits)
        System.out.println("Casting long to float:");
        System.out.println("Original long value: " + longValue);
        System.out.println("Casted float value: " + floatFromLong);  // Expected output: 123456792.0 (possible precision loss)
        System.out.println("------------------------------------------------");

        // Example 5: Casting from char to int (unicode to integer)
        char charValue = 'A';  // Original char value
        int intFromChar = (int) charValue;  // Cast to int (32 bits)
        System.out.println("Casting char to int:");
        System.out.println("Original char value: " + charValue);
        System.out.println("Casted int value: " + intFromChar);  // Expected output: 65 (ASCII value of 'A')
        System.out.println("------------------------------------------------");

        // Example 6: Casting from byte to short (widening conversion, no data loss)
        byte byteValueForShort = 120;  // Original byte value
        short shortValue = (short) byteValueForShort;  // Cast to short (16 bits)
        System.out.println("Casting byte to short:");
        System.out.println("Original byte value: " + byteValueForShort);
        System.out.println("Casted short value: " + shortValue);  // Expected output: 120 (no data loss)
        System.out.println("------------------------------------------------");

        // Example 7: Casting from short to long (widening conversion, no data loss)
        short shortValueForLong = 32000;  // Original short value
        long longValueFromShort = (long) shortValueForLong;  // Cast to long (64 bits)
        System.out.println("Casting short to long:");
        System.out.println("Original short value: " + shortValueForLong);
        System.out.println("Casted long value: " + longValueFromShort);  // Expected output: 32000 (no data loss)
        System.out.println("------------------------------------------------");

        // Example 8: Casting from float to double (widening conversion, no data loss)
        float floatValueForDouble = 12.34f;  // Original float value
        double doubleValueFromFloat = (double) floatValueForDouble;  // Cast to double (64 bits)
        System.out.println("Casting float to double:");
        System.out.println("Original float value: " + floatValueForDouble);
        System.out.println("Casted double value: " + doubleValueFromFloat);  // Expected output: 12.34 (no data loss)
    }
}
