public class Operators {
    public static void main(String[] args) {
        // Arithmetic
        int num1 = 5;
        int num2 = 13;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num2 / (double)num1);
        System.out.println(num2 % num1 + "\n");

        // Relational
        int a = 10;
        int b = 20;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println((a!=b) + "\n");

        // Logical
        int x = 5;
        int y = 10;
        int z = 15;
        boolean condition1 = x>y;
        boolean condition2 = y>z;
        boolean condition3 = z>x;
        
        boolean answer1 = condition1 && condition2 && condition3;
        System.out.println(answer1);
        boolean answer2 = condition1 || condition2 || condition3;
        System.out.println(answer2);
        boolean answer3 = !condition1;
        System.out.println(answer3 + "\n");

        // Assignment
        int age = 12;
        //age = age + 9;
        age += 9;
        System.out.println(age);

        //age = age - 1;
        age -= 1;
        System.out.println(age);

        //age = age * 10;
        age *= 10;
        System.out.println(age);

        //age = age / 20;
        age /= 20;
        System.out.println(age);

        //age = age % 4;
        age %= 4;
        System.out.println(age + "\n");

        // Unary
        int value1 = 5;
        System.out.println(value1++);
        System.out.println(value1);

        int value2 = 10;
        System.out.println(--value2);
        System.out.println(value2--);
        System.out.println(value2);
    }
}
