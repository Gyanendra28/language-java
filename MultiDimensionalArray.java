public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Creation
        // int arr[][] = new int[3][4];

        // Initialisation
        int arr[][] = {
            {2, 4, 6, 100},
            {1, 3, 5, 200},
            {10, 20, 30, 400}
        };

        // Printing the 2D array
        // 1. Using for each loop
        for(int[] row : arr) {
            for(int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // 2. Using row and column size
        int rowSize = arr.length;
        int colSize = arr[0].length;
        System.out.println("Number of rows = " + rowSize + "\n" + "Number of columns = " + colSize);
        for(int rowIndex=0; rowIndex<rowSize; rowIndex++) {
            for(int colIndex=0; colIndex<colSize; colIndex++) {
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }
}