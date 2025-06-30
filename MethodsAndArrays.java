public class MethodsAndArrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        // Printing the array
        printArray(arr);

        // Sum of all values
        int result = printSum(arr);
        System.out.println("Sum is " + result);

        // Doubling the values
        System.out.println("Before doubling -");
        printArray(arr);
        printDouble(arr);
        System.out.println("After doubling -");
        printArray(arr);
    }
    public static void printArray(int arr[]) {
        System.out.print("Array : ");
        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static int printSum(int arr[]) {
        int sum = 0;
        for(int element : arr) {
            sum = sum + element;
        }
        return sum;
    }
    public static void printDouble(int arr[]) {
        int length = arr.length;
        for(int i=0; i<length; i++) {
            arr[i] = 2*arr[i];
        }
    }
}