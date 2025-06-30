import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        // Counting from 1 to n
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while(i<=num);

        // Counting from n to 1
        i = num;
        do {
            System.out.println(i);
            i--;
        }
        while(i>=1);

        // 10 multiples of n
        i = 1;
        do {
            System.out.println(num + " * " + i + " = " + (num*i));
            i++;
        }
        while(i<=10);

        // Name 100 times
        i = 0;
        do {
            System.out.println("Gyanendra Singh");
            i++;
        }
        while(i<100);

        // Prime numbers from 1 to 100
        i = 2;
        do {
            int j = 1, count = 0;
            do {
                if(i%j==0) {
                    count += 1;
                }
                j++;
            }
            while(j<=i);
            if(count==2) {
                System.out.println(i);
            }
            i++;
        }
        while(i<=100);

        // Even numbers from 1 to 100
        i = 1;
        do {
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }
        while(i<=100);

        // Sum from 1 to n
        i = 1;
        int sum = 0;
        do {
            sum+=i;
            i++;
        }
        while(i<=num);
        System.out.println("Sum from 1 to " + num + " is " + sum);

        // Integers divisible by 7 between 50 and 100
        i = 50;
        do {
            if(i%7==0) {
                System.out.println(i);
            }
            i++;
        }
        while(i<=100);
        sc.close();
    }
}