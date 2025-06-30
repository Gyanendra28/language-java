public class DataTypes {
    public static void main(String[] args) {
        // boolean
        boolean value = true; // In Java, true != 1 and false != 0
        System.out.println(value);

        // character
        char ch = 'G';
        System.out.println("My initial is " + ch + " and its ASCII value is " + (ch+0));
        System.out.println("G + 1 = 71 + 1 = " + (ch+1)); // Arithmetic operation through ASCII value
        System.out.println("72 is " + (char)(ch+1)); // Type Casting

        // integers - byte, short, int, long
        byte marks = 90;
        System.out.println(marks);

        short weight = 30000;
        System.out.println(weight);

        int height = 100000;
        System.out.println(height);

        long length = 10000000000L;
        System.out.println(length);

        // float
        float number = 3.14159265f;
        System.out.println(number);

        // double
        double percentage = 99.9887776666;
        System.out.println(percentage);

        // Implicit type conversion
        byte num1 = 12;
        short num2 = num1;
        System.out.println(num2);
        int num3 = num2;
        System.out.println(num3);
        long num4 = num3;
        System.out.println(num4);

        // Explicit type conversion
        int num = 107;
        char myCh = (char)num; // Incompatible
        System.out.println(myCh);

        int myNum1 = 500;
        byte myNum2 = (byte)myNum1; // Source(int) > Destination(byte)
        System.out.println(myNum2);
    }
}