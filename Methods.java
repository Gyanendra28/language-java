import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(10);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        callMyName(name);
        callMyName();

        System.out.println(40);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int result = getSum(a, b);
        System.out.println("Sum = " + result);


        sc.close();
    }
    public static void callMyName(String name) {
        System.out.println(20);

        System.out.println("My name is " + name);

        System.out.println(30);
    }
    public static void callMyName() {
        System.out.println("My name is Gyanendra Singh");
    }
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;

        // System.out.println(50); unreachable statement
    }
}