import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        // creates an object of Scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age : ");

        // takes input from keyboard
        int age = input.nextInt();

        // prints the age
        System.out.println("My age is " + age);

        // closes the Scanner class object
        input.close();
    }
}
