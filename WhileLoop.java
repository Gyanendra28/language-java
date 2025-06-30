import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        // Counting from 1 to n
        int i = 1;
        while(i<=num) {
            System.out.println(i);
            i++;
        }

        // Counting from n to 1
        i = num;
        while(i>=1) {
            System.out.println(i);
            i--;
        }

        // 10 multiples of n
        i = 1;
        while(i<=10) {
            System.out.println(num + " * " + i + " = " + (num*i));
            i++;
        }

        // Name 100 times
        i = 0;
        while(i<100) {
            System.out.println("Gyanendra Singh");
            i++;
        }

        // Prime numbers from 1 to 100
        i = 2;
        while(i<=100) {
            int j=1, count = 0;
            while(j<=i) {
                if(i%j==0) {
                    count += 1;
                }
                j++;
            }
            if(count==2) {
                System.out.println(i);
            }
            i++;
        }

        // Even numbers from 1 to 100
        i = 1;
        while(i<=100) {
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }

        // Sum from 1 to n
        i = 1;
        int sum = 0;
        while(i<=num) {
            sum+=i;
            i++;
        }
        System.out.println("Sum from 1 to " + num + " is " + sum);

        // Integers divisible by 7 between 50 and 100
        i = 50;
        while(i<=100) {
            if(i%7==0) {
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}