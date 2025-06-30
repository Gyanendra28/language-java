import java.util.Scanner;
public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input
        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = sc.next();
        System.out.println("Your name is " + firstName + " " + lastName);

        // Strings comparison
        
        // using == operator (reference comparison)
        String name1 = "Geralt";
        String name2 = "geralt";
        String name3 = new String("Geralt");

        if(name1==name2)
            System.out.println("String references are equal");
        else
            System.out.println("String references are not equal");
        
        // using equals() method (value comparison)
        if(name1.equals(name3)) // equalsIgnoreCase() method for ignoring case sensitivity
            System.out.println("String values are same");
        else
            System.out.println("String values are not same");

        // Java String methods
        String str1 = "My name is Gyanendra Singh";
        String str2 = "   Hello     ";
        String str3 = "Jennefer";
        String str4 = "   ";
        int num = 117;

        System.out.println(str1.length());
        System.out.println(str1.charAt(11));
        System.out.println(str1.substring(0, 21));
        System.out.println(str1.substring(11));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str2.trim());
        String[] words = str1.split(" ");
        for(String word : words) {
            System.out.println(word);
        }
        System.out.println(str1.startsWith("My name"));
        System.out.println(str2.endsWith(" "));
        String year = String.valueOf(num);
        System.out.println(year + 3);
        str3 = str3.replace('J', 'Y');
        System.out.println(str3);
        char name[] = str3.toCharArray();
        for(char letter : name) {
            System.out.println(letter);
        }
        System.out.println(str4.isEmpty());
        System.out.println(str4.isBlank());

        sc.close();
    }
}