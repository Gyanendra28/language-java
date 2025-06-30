import java.util.Scanner;
public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array
        int size;
        System.out.print("Enter the size of array : ");
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // Printing the array
        System.out.print("Array : ");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        // Sum of all values
        int sum = 0;
        for(int num : arr) {
            sum = sum + num;
        }
        System.out.println("\nTotal sum = " + sum);

        // Multiplication of all values
        int mul = 1;
        for(int num : arr) {
            mul = mul * num;
        }
        System.out.println("Total product = " + mul);

        // Minimum element of array
        int min = Integer.MAX_VALUE;
        for(int num : arr) {
            if(num<min) {
                min = num;
            }
        }
        System.out.println("Minimum element = " + min);

        // Maximum element of array
        int max = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num>max) {
                max = num;
            }
        }
        System.out.println("Maximum element = " + max);

        sc.close();
    }
}