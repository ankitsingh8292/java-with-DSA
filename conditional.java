// import java.util.*;

// IF ELSE STSTEMENT   //

// public class conditional {
// public static void main (String[] args) {
//       int age = 20;
//       if (age < 18) {
//           System.out.println("Minor");
//       } else {
//           System.out.println("Adult");
//       }

//     }
// }


// PRINT THE LARGEST OF 2 //

// public class conditional {
//     public static void main (String[] args) {
//         int A = 10;
//         int B = 5;

//         if (A >= B) {
//             System.out.println("A is largest of 2");
//         } else {
//             System.out.println("B is largest of 2");
//         }
//     }
// }


// PRINT IF A  NUMBER IS ODD OR EVEN //

// public class conditional {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if (number % 2 == 0) {
//             System.out.println("Even Number");
//         } else {
//             System.out.println("Odd Number");
//         }
//     }
// }


// ELSE IF STATEMENT //

// public class conditional {
//     public static void main (String[] args) {
//         int age = 13;

//         if (age >= 18) {
//             System.out.println("adult");
//         } 
//         else if (age >= 13 && age < 18) {
//             System.out.println("Teenager");
//         } else {
//             System.out.println("child");
//         }
//     }
// }


// INCOME TAX CALCULATOR //

// public class conditional {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;

//         if (income <= 500000) {
//             tax = 0;
//         } 
//         else if (income >= 500000 && income <= 1000000) {
//             tax = (int) (income * 0.2);
//         } 
//         else {
//             tax = (int) (income * 0.3);
//         }
//         System.out.println("your tax is: " + tax);

//     }
// }


// PRINT THE LARGEST OF 3 //

// public class conditional {
//     public static void main (String[] args) {
//         int A = 1, B = 2, C = 6;

//         if (A >= B &&  A >= C) {
//             System.out.println("A is largest");
//         } 
//         else if (B >= C) {
//             System.out.println("B is largest");
//         } 
//         else {
//             System.out.println("C is largest");
//         }
//     }
// }


// TERNARY OPERATOR //

// public class conditional {
//     public static void main (String[] args) {
//         int number = 9;

//         //ternary operator//

//          String type = ((number%2) == 0) ? "even" : "odd";
//          System.out.println(type);
//     }
// }


// check if a student will pass or fail based on marks //

// public class conditional {

//     public static void main(String[] args) {
//         int marks = 85;

//         String reportcad = marks >= 33 ? "pass" : "fail";
//         System.out.println(reportcad);
//     }
// }


// SWITCH STATEMENTS //

// public class conditional {
//     public static void main (String[] args) {
//         int number = 2;
//          switch (number) {
//             case 1 : System.out.println("samosa");
//                         break;
//             case 2 : System.out.println("burger");
//                         break;
//             case 3 : System.out.println("mango shake");
//                         break;
//             default : System.out.println("we realize we are dreaming");
                
//          } 
//     }
// }   


// calculator using switch case //

// public class conditional {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a :");
//         int a = sc.nextInt();
//         System.out.println("enter b :");
//         int b = sc.nextInt();
//         System.out.println("enter operator :");
//         char operator = sc.next().charAt(0);

//         switch (operator) {
//             case '+': System.out.println(a + b);
//                         break; 
//             case '-': System.out.println(a - b);
//                         break;  
//             case '*': System.out.println(a * b);
//                         break;
//             case '/': System.out.println(a / b);
//                         break;
//             case '%': System.out.println(a % b);
//                         break;
//             default: System.out.println("wrong operator");      
//         }
//     }
// }           



// END CONDITIONAL STSTEMENTS //