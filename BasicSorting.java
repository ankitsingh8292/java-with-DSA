import java.util.*;

// BUBBLE SORT //

// public class BasicSorting {
//     public static void bubbleSort(int[] arr) {
//         for (int turn=0; turn<arr.length-1; turn++) {
//             for (int j=0; j<arr.length-1-turn; j++) {
//                 if (arr[j] > arr[j+1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void printArr(int[] arr) {
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int [] arr = {5, 4, 1, 3, 2};
//         bubbleSort(arr);
//         printArr(arr);
//     }
// }
    

// SELECTION SORT //

// public class BasicSorting {
//     public static void selectionSort(int[] arr) {
//         for (int i=0; i<arr.length-1; i++) {
//             int minPos = i;
//             for (int j=i+1; j<arr.length; j++) {
//                 if (arr[minPos] > arr[j]) {
//                     minPos = j;
//                 }
//             }
//             // swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void printArr(int[] arr) {
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int [] arr = {5, 4, 1, 3, 2};
//         selectionSort(arr);
//         printArr(arr);
//     }
// }


// INSERTION SORT //

// public class BasicSorting {
//     public static void insertionSort(int[] arr) {
//         for (int i=1; i<arr.length; i++) {
//             int curr = arr[i];
//             int prev = i-1;

//             // finding out the correct position to insert and shift elements
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             // insertion
//             arr[prev+1] = curr;
//         }
//     }
//     public static void printArr(int[] arr) {
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int [] arr = {5, 4, 1, 3, 2};
//         insertionSort(arr);
//    for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }
//        printArr(arr);
//     }
// }


// INBUILT SORT //

// public class BasicSorting {
//     public static void main(String[] args) {
//         int [] arr = {5, 4, 1, 3, 2};
//         Arrays.sort(arr);
     

// INBUILT SORT COLLECTIONS.REVERSEORDER //

// public class BasicSorting {
//     public static void main(String[] args) {
//         Integer [] arr = {5, 4, 1, 3, 2};  // yaha integer ko capital karna hoga kyunki Collections.reverseOrder() sirf objects ke liye kaam karta hai, primitive types ke liye nahi
//         Arrays.sort(arr, Collections.reverseOrder());
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }


// COUNTING SORT //

public class BasicSorting {
    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
            smallest = Math.min(smallest, arr[i]);
        }

        int[] count = new int[largest - smallest + 1];
        for (int i=0; i<arr.length; i++) {
            count[arr[i] - smallest]++;
        }

        // sorting
        int j=0;
        for (int i=0; i<count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i + smallest;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr(arr);
    }
}


// END OF THE FILE //