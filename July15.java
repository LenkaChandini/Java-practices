class July15 {
    public static void main(String[] args) {

        // byte is used to store small whole numbers.
        byte a = 30;
        byte b = 10;

        // When two byte values are multiplied,
        // Java automatically converts the result to int.
        int result = a * b;

        // Print the multiplication result.
        System.out.println("byte a * byte b = (converts the result into int value) - "+result);

        // Type Conversion
        // Java automatically converts a smaller data type (short)
        // into a larger data type (int). This is called type conversion.
        short smallValue = 1000;
        int intValue = smallValue;

        // Print the converted int value.
        System.out.println(intValue);


        // Type Casting
        // Convert float to int using explicit casting.
        // The decimal part is removed.
        float f = 5.6f;
        int k = (int) f;

             // Print the int value.
        System.out.println("Float value convert into int: "+k);

    }
}
