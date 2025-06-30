import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // if statement
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age>=18) {
            System.out.println("You are eligible to vote");
        }
        
        // if-else statement
        int income;
        System.out.print("Enter your income : ");
        income = sc.nextInt();
        if(income>100000) {
            System.out.println("You are rich");
        }
        else {
            System.out.println("You are not rich");
        }

        // ternary operator (?)
        @SuppressWarnings("unused")
        boolean ans = (10 > 20) ? true : false;
        System.out.println("10 > 20 is " + ans);

        // nested if-else statement
        int age1;
        System.out.print("Enter your age : ");
        age1 = sc.nextInt();
        boolean knowDriving;
        System.out.print("Do you know driving ? (true or false) : ");
        knowDriving = sc.nextBoolean();
        if(age1>=18) {
            if(knowDriving==true) {
                System.out.println("You are eligible for a driving license");
            }
            else {
                System.out.println("Learn to drive first");
            }
        }
        else {
            System.out.println("You do not meet the minimum age requirement");
        }

        // if-else if-else ladder
        int income1;
        System.out.print("Enter your income : ");
        income1 = sc.nextInt();
        if(income1>100000) {
            System.out.println("You are among the top 5% Indians");
        }
        else if(income1>90000) {
            System.out.println("You are among the top 10% Indians");
        }
        else if(income1>50000) {
            System.out.println("You are among the top 20% Indians");
        }
        else if(income1>30000) {
            System.out.println("You are among the top 40% Indians");
        }
        else if(income1>20000) {
            System.out.println("You are among the top 50% Indians");
        }
        else { // not mandatory
            System.out.println("You have a low income");
        }

        // switch statement
        int day;
        System.out.print("Enter the day number : ");
        day = sc.nextInt();
        switch(day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Sunday");
        }
        sc.close();
    }
}
