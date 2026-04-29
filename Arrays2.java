// import java.util.*;

// MAXIMUM SUBARRAY SUM - O(n^3) //

// public class Arrays2 {
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;            
//                 currSum = 0;
//                 for (int k = i; k <= j; k++) { //print
//                     //subarray sum
//                     currSum += numbers[k];
//                 }
//                 System.out.println("max sum = " + maxSum);
//                 if (currSum > maxSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Maximum subarray sum: " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxSubarraySum(numbers);
//     }
// }


// PREFIX SUM ARRAY 

// public class Arrays2 {
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         //calculate prefix array
//         prefix[0] = numbers[0];
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + numbers[i];
//         }

//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;   

//                 currSum = start == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }

//         System.out.println("Maximum subarray sum: " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxSubarraySum(numbers);
//     }
// }


// KADANE'S ALGORITHM - O(n) //

// public class Arrays2 {
//     public static void kadanes(int numbers[]) {
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             cs = cs + numbers[i];
//             if (cs < 0 ) {
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//             if (cs < 0) {
//                 cs = 0;
//             }
//         }

//         System.out.println("Maximum subarray sum: " + ms);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {-2,  -3, 4, -1, -2, 1, 5, -3};
//         kadanes(numbers);
//     }
// }


// TRAPPING RAIN WATER PROBLEM - O(n) //

// public class Arrays2 {
    
//     public static void trappedRainwater(int height[]) {
//         int n = height.length;

//         // calculate left max boundary - array
//         int leftMax[] = new int[height.length];
//         leftMax[0] = height[0];
//         for (int i = 1; i < height.length; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }

//         // calculate right max boundary - array
//         int rightMax[] = new int[height.length];
//         rightMax[height.length - 1] = height[height.length - 1];
//         for (int i = height.length - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }

//         int trappedWater = 0;
//         // loop++
//         for(int i=0; i<n; i++){
//             // waterLevel = min(leftmax boundary, rightmax boundary)
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             // trapped water = waterLevel - height[i]
//             trappedWater += waterLevel - height[i];
//         }
//         System.out.println("Trapped rain water: " + trappedWater);

//     }
    
//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//        trappedRainwater(height);

//     }
// }  // most important hai ye question interview ke liye// 



// BUY AND SELL STOCK PROBLEM - O(n) //

// public class Arrays2 {
    
//     public static void buyAndSellStock(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             if (buyPrice < prices[i]) {  // profit
//                 int profit = prices[i] - buyPrice; //today's profit
//                 maxProfit = Math.max(profit, maxProfit);
//             } else { // loss
//                 buyPrice = prices[i];
//             }
//         }

//         System.out.println("Maximum profit: " + maxProfit);
//     }
    
//     public static void main(String args[]) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//        buyAndSellStock(prices);

//     }
// }


// END OF THE FILE //