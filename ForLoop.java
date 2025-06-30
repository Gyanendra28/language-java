import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        // Counting from 1 to n
        for(int i=1; i<=num; i++) {
            System.out.println(i);
        }

        // Counting from n to 1
        for(int i=num; i>=1; i--) {
            System.out.println(i);
        }

        // 10 multiples of n
        for(int i=1; i<=10; i++) {
            System.out.println(num*i);
        }

        // Name 100 times
        for(int i=0; i<100; i++) {
            System.out.println("Gyanendra Singh");
        }

        // Prime numbers from 1 to 100
        for(int i=2; i<=100; i++) {
            int count = 0;
            for(int j=1; j<=i; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2) {
                System.out.println(i);
            }
        }

        // Even numbers from 1 to 100
        for(int i=1; i<=100; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }

        // Sum from 1 to n
        int sum = 0;
        for(int i=1; i<=num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum from 1 to " + num + " = " + sum);

        // Integers divisible by 7 between 50 and 100
        for(int i=50; i<=100; i++) {
            if(i%7==0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}