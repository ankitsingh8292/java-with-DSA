// import java.util.*;
// public class Functions {
//     public static void printhelloworld() {
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//     }

//     public static int calculateSum(int num1, int num2) {  //parameters or formal parameters
//         int sum = num1 + num2;
//         // System.out.println("sum is : " + sum);
//         return sum;
//     }

//     public static void main(String[] args) {
//         // printhelloworld();  //function call 
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);   // aruments or actual parameters
//         System.out.println("Sum is: " + sum);
//     }
// }

// call by value : when we pass primitive data type as an argument to a function, the value of the variable is passed to the function.


// FIND PRODUCT OF A & B //

// public class Functions {
//     public static int multiply( int a, int b) {  //parameters or formal parameters
//         int product = a * b;
//         // System.out.println("product is : " + product);
//         return product;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = multiply(a, b);   // aruments or actual parameters
//         System.out.println("Product is: " + product);
//     }
// }



// FACTORIAL OF A NUMBER, N //

// public class Functions {
//     public static int factorial(int n) {  //parameters or formal parameters
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }
//         return fact;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int result = factorial(n);   // aruments or actual parameters
//         System.out.println("Factorial of " + n + " is: " + result);
//     }
// }


// BINOMIAL COEFFICIENT //

// public class Functions {
//     public static int factorial(int n) {  //parameters or formal parameters
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }
//         return fact;
//     }

//     public static int binomialCoefficient(int n, int r) {
//         int numerator = factorial(n);
//         int denominator = factorial(r) * factorial(n - r);
//         return numerator / denominator;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         int result = binomialCoefficient(n, r);   // aruments or actual parameters
//         System.out.println("Binomial Coefficient C(" + n + ", " + r + ") is: " + result);
//     }
// }


// FUNCTION OVERLOADING : Multiple functions with the same name but different parameters. //

// fun to calc sum of 2 nums

// public class Functions {
//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(3, 5));
//         System.out.println( sum(5, 2, 1));  

//     }
// }


// Functiopn Overloading using Data Types //

// public class Functions {
//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static float sum(float a, float b) {
//         return a + b;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(3, 5));
//         System.out.println( sum(3.2f, 4.8f));  

//     }
// }


// CHECK IF A NUMBER IS PRIME OR NOT //

// public class Functions {
//     public static boolean isPrime(int n) {
//         if (n <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean result = isPrime(n);
//         if (result) {
//             System.out.println(n + " is a prime number.");
//         } else {
//             System.out.println(n + " is not a prime number.");
//         }
//     }
// }


// PRINT ALL PRIMES IN A RANGE 2 TO 20//

// public class Functions {
//     public static boolean isPrime(int n) {
//         if (n <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void PrimesInRange(int n) {
//         for (int i = 2; i <= n; i++) {
//             if (isPrime(i)) { // true
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println(); // newline after printing all primes
//     }

//     public static void main(String[] args) {
//         PrimesInRange(20);
//     }
// }


// CONVERT FROM BINARY TO DECIMAL //

// public class Functions {
//     public static int binaryToDecimal(int binNum) {
//         int decimal = 0;
//         int power = 0;

//         int binary = binNum; // Create a local copy of binNum to avoid modifying the original value

//         while (binNum > 0) {
//             int lastDigit = binNum % 10;
//             decimal = decimal + (lastDigit * (int)Math.pow(2, power));
//             power++;
//             binNum /= 10;  // remove the last digit
//         }
//         System.out.println("decimal of " + binary +" = " +decimal);
//         return decimal;
//     }

//     public static void main(String[] args) {
//         binaryToDecimal(101);

//     }
// }


// CONVERT FROM DECIMAL TO BINARY //

// public class Functions {
//     public static void decimalToBinary(int decNum) {
//         StringBuilder binary = new StringBuilder();

//         while (decNum > 0) {
//             int remainder = decNum % 2;
//             binary.append(remainder);
//             decNum /= 2; // divide by 2
//         }
//         binary.reverse(); // reverse the string to get the correct order
//         System.out.println("binary of " + decNum + " = " + binary);
//     }

//     public static void main(String[] args) {
//         decimalToBinary(5);
//     }
// }


// Method SCOP //

// public class Functions {
//     public static void printhelloworld() {
//         System.out.println("Hello world");
//     }   
//     public static void main(String[] args) {    
//         printhelloworld();  //function call 
//     }
// }


// Block Scope //

// public class Functions {
//     public static void printhelloworld() {
//         System.out.println("Hello world");
//     }

//     public static void main(String args[]) {
//         for (int i = 1, j = 0, k = 0; i <= 5; i++) {
//             // loop body
//         }
//         int i = 4;
//         System.out.println(i); // 4
//     }
// }




// END FUNCTIONS & METHODS //  Ankit singh // Thanku