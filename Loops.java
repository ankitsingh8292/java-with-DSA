
// WHILE LOOP  //

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         int count = 0;
//         while (count < 10) {
//             System.out.println("Hello, World!");
//             count++;
//         }

//         System.out.println("printer HW 10x");
//     }
// }


// PRINT NUMBER FROM 1 TO 10 //

// public class Loops {
//     public static void main(String[] args) {
//         int counter = 1;
//         while (counter <= 10) {
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }


// PRINT NUMBER FROM 1 TO N //

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int counter = 1;
//         while (counter <= n) {
//             System.out.print(counter + " ");
//             counter++;
//         }
//         System.out.println();
//     }
// }


// PRINT SUM OF FIRST N NATURAL NUMBERS //

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;

//         int i=1;
//         while (i <= n) {
//             sum += i;
//             i++;
//         }
//         System.out.println("Sum is: " + sum);
//     }
// }


// FOR LOOP  //

// public class Loops {
//     public static void main(String[] args) {

//         for (int i=1; i<=10; i++) {
//             System.out.println("Hello, World!");
//         }

//         System.out.println("printer HW 10x");
//     }
// }


// PRINT SQUARE PATTERN //

// public class Loops {
//     public static void main(String[] args) {
//         for (int line = 1; line <= 4; line++) {
//             System.err.println("****");
//         }
//     }
// }


// PRINT REVERSE OF A NUMBER  (10899) //

// public class Loops {
//     public static void main(String[] args) { 
//         int n = 10899;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n / 10; 
//         }
//          System.out.println();
//     }
// }


// REVERSE THE GIVEN NUMBER //

// public class Loops {
//     public static void main(String[] args) { 
//         int n = 10899;
//         int reverse = 0;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             reverse = reverse * 10 + lastDigit;
//             n = n / 10; 
//         }
//          System.out.println("Reversed Number: " + reverse);
//     }
// }


// DO-WHILE LOOP  //

// public class Loops {

//     public static void main(String[] args) {
//         int counter =1;
//         do {
//             System.out.println("Hello world");
//             counter++;
//         } while(counter <= 10);
//     }
// }


// BREAK STATEMENT //

// public class Loops {

//     public static void main(String[] args) {
//         for (int i=1; i <= 10; i++) {
//             if (i ==3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("i am out of the loop");
//     }
// }


// keep entering numbers till user  enters a multiple of 10 //

// public class Loops {

   
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("Enter your number: ");
//              // Read an integer from the user
//             int n = sc.nextInt();
//             if (n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//         } while (true);
//     }
// }
        

// CONTINUE STATEMENT //

// public class Loops {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 10; i++) {
//             if (i == 3) {
//                 continue; // Skip the rest of the loop when i is 3
//             }
//             System.out.println(i);
//         }
//         System.out.println("Loop completed, skipped number 3.");
//     }
// }


// display all numbeers entered by user except multiples of 10  by using continue statement //

// public class Loops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("Enter your number: ");
//             int n = sc.nextInt();

//             if (n % 10 ==  0) {
//                 continue;
//             }
//             System.out.println("You entered: " + n);
//         } while (true);
//         // Note: This loop will run indefinitely until manually stopped.
//     }
// }


// chech if a number is prime or not //

// public class Loops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         boolean isPrime = true;
//         for(int i=2; i<=n-1; i++) {
//             if(n % i == 0) { // n is a multiple of i (i not equql to 1 and n)
//                 isPrime = false;
//             }
//         }
//         if (isPrime == true) {
//             System.out.println("n is prime");
//         } else {
//             System.out.println("n is not prime");
//         }
//     }
// }



// END LOOPS (FLOW CONTROL) //
