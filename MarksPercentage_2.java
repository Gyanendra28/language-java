import java.util.Scanner;
public class MarksPercentage_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float marks;
        float totalMarks = 0;
        float minMark = Integer.MAX_VALUE;


        for(int i=1; i<=5; i++) {
            System.out.print("Enter subject " + i + " marks : ");
            marks = sc.nextFloat();
            totalMarks += marks;

            if(marks<minMark) {
                minMark = marks;
            }
        }
        totalMarks = (totalMarks - minMark)/4;
        System.out.println("Best 4 of 5 percentage = " + totalMarks);
        sc.close();
    }
}