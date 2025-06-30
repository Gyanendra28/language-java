import java.util.Scanner;
public class MethodsProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print name N times
        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        printName(num);

        // Sum from 1 to N
        printSum(num);

        // Average of two numbers
        int a, b;
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();
        float result = getAverage(a, b);
        System.out.println("Average is " + result);

        // Minimum of two numbers
        int min = getMinimum(a, b);
        System.out.println("Minimum number is " + min);

        // Maximum of two numbers
        int max = getMaximum(a, b);
        System.out.println("Maximum number is " + max);

        // Exponent of a number
        int exp = getExponent(a, b);
        System.out.println("Exponent value is " + exp);
        
        // Absolute value of a number
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int abs = getAbsolute(n);
        System.out.println("Absolute value is " + abs);

        // Random number between 1 to N
        int N;
        System.out.print("Enter a number : ");
        N = sc.nextInt();
        int random = getRandom(N);
        System.out.println("Random value is " + random);

        sc.close();
    }
    public static void printName(int num) {
        for(int i=0; i<num; i++) {
            System.out.println("Gyanendra Singh");
        }
    }
    public static void printSum(int num) {
        int sum = 0;
        for(int i=1; i<=num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
    }
    public static float getAverage(int a, int b) {
        float average = (float)(a+b)/2;
        return average;
    }
    public static int getMinimum(int a, int b) {
        if(a<=b)
            return a;
        else
            return b;
    }
    public static int getMaximum(int a, int b) {
        if(a>=b)
            return a;
        else
            return b;
    }
    public static int getExponent(int a, int b) {
        int exp = 1;
        for(int i=1; i<=b; i++) {
            exp = exp*a;
        }
        return exp;
    }
    public static int getAbsolute(int n) {
        if(n>=0)
            return n;
        else
            return (0-n);
    }
    public static int getRandom(int N) {
        return 1 + (int)(Math.random()*N);
    }
}