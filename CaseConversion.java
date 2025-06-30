import java.util.Scanner;
public class CaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word;
        System.out.print("Enter a word : ");
        word = sc.nextLine();
        String lowerCase = word.toLowerCase();
        String upperCase = word.toUpperCase();

        System.out.println("Lower case representation : " + lowerCase);
        System.out.println("Upper case representation : " + upperCase);
        
        sc.close();
    }
}