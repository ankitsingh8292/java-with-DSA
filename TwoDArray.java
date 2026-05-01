import java.util.*;

// public class TwoDArray {
//     public static void search(int matrix[][], int target) {
//         int n = matrix.length, m = matrix[0].length;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (matrix[i][j] == target) {
//                     System.out.println("Element found at position: (" + i + ", " + j + ")");
//                     return;
//                 }
//             }
//         }
//         System.out.println("Element not found");
//     }

//     public static void main(String[] args) {
//         int matrix[][] = new int [3][3];
//         int n = matrix.length, m = matrix[0].length;

//         Scanner sc = new Scanner(System.in);
//         // Input values for the matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
        
//         }

//         // output the matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         // Search for an element
//         System.out.print("Enter the element to search: ");
//         int target = sc.nextInt();
//         search(matrix, target);
//     }
// }


// Question // SPRIAL MATRIX //  Google, Microsoft, Amazon, Facebook, Apple, Adobe, ye sab company ne already puch rakha hai  

// public class TwoDArray {
//     public static void spiralMatrix(int matrix[][]) {
//         int startRow = 0, endRow = matrix.length - 1;
//         int startCol = 0, endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {
//             // top
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             // right
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             // bottom
//             if (startRow != endRow) {
//                 for (int j = endCol - 1; j >= startCol; j--) {
//                     System.out.print(matrix[endRow][j] + " ");
//                 }
//             }

//             // left
//             if (startCol != endCol) {
//                 for (int i = endRow - 1; i > startRow; i--) {
//                     System.out.print(matrix[i][startCol] + " ");
//                 }
//             }

//             startRow++;
//             endRow--;
//             startCol++;
//             endCol--;
//         }
//     }

//     public static void main(String[] args) {
//         int matrix[][] = { {1, 2, 3, 4}, 
//                            {5, 6, 7, 8}, 
//                            {9, 10, 11, 12},
//                            {13, 14, 15, 16} };
//         spiralMatrix(matrix);
//     }
// }


// Diagonal Sum // Amazon, Microsoft, Samsung, ye sare company ne puch rakha hai

public class TwoDArray {
    public static void diagonalSum(int matrix[][]) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if (i != n - 1 - i) { // to avoid double counting the center element in odd-sized matrices
                sum += matrix[i][n - 1 - i];
            }
        }

        System.out.println("Diagonal sum: " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { {1, 2, 3, 4}, 
                           {5, 6, 7, 8}, 
                           {9, 10, 11, 12},
                           {13, 14, 15, 16} };
        diagonalSum(matrix);
    }
}