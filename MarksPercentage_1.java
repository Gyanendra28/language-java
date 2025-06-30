import java.util.Scanner;
public class MarksPercentage_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float marks1, marks2, marks3, marks4, marks5;
        System.out.print("Enter first subject marks : ");
        marks1 = sc.nextFloat();
        System.out.print("Enter second subject marks : ");
        marks2 = sc.nextFloat();
        System.out.print("Enter third subject marks : ");
        marks3 = sc.nextFloat();
        System.out.print("Enter fourth subject marks : ");
        marks4 = sc.nextFloat();
        System.out.print("Enter fifth subject marks : ");
        marks5 = sc.nextFloat();

        System.out.println("Overall percentage = " + (marks1 + marks2 + marks3 + marks4 + marks5)/5);
        sc.close();
    }
}
