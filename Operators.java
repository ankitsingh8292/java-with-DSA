
// ARITHMETIC OPERATORS (Binary operators) //

// public class operators {
//     public static void main(String[] args) {
//         int A = 10;
//         int B = 5;
//         System.out.println("add =" + (A+B));
//         System.out.println("sub =" + (A-B));
//         System.out.println("mul =" + (A*B));
//         System.out.println("div =" + (A/B));
//     }
    
// }


// UNARY OPERATORS (Pre increment) //

// public class operators {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = ++a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// UNARY OPERATORS (Post Increment) //

// public class operators {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = a++;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// UNARY OPERATORS (Pre Decrement) //

// public class operators {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = --a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// UNARY OPERATORS (Post Decrement) //

// public class operators {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = a--;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// RELATIONAL OPERATORS //

// public class operators {
//     public static void main(String[] args) {
//         int A = 10;
//         int B = 5;
//         System.out.println(A > B);   // true
//         System.out.println(A < B);   // false
//         System.out.println(A >= B);  // true
//         System.out.println(A <= B);  // false
//         System.out.println(A == B);  // false
//         System.out.println(A != B);  // true
//     }
// }


// LOGICAL OPERATORS //

// public class operators {
//     public static void main(String[] args) {
//         boolean A = true;
//         boolean B = false;
//         System.out.println(A && B);  // false
//         System.out.println(A || B);  // true
//         System.out.println(!A);       // false
//         System.out.println(!B);       // true
//     }
// }


// ASSIGNMENT OPERATORS //

// public class operators {
//     public static void main(String[] args) {
//         int A = 10;
//         A += 5;  // A = A + 5
//         System.out.println(A);  // 15
//         A -= 3;  // A = A - 3
//         System.out.println(A);  // 12
//         A *= 2;  // A = A * 2
//         System.out.println(A);  // 24
//         A /= 4;  // A = A / 4
//         System.out.println(A);  // 6
//     }
// }



 // OPERATORS QUESTIONS //
// What will be the output of the following programs? //

// (1)

// public class operators {

//     public static void main(String[] args) {
//         int x = 2, y = 5;
//         int exp1 = (x * y / x);     // (2 * 5) / 2 = 10 / 2 = 5
//         int exp2 = (x * (y / x));   // 2 * (5 / 2) = 2 * 2 = 4
//         System.out.println(exp1 + " ' ");
//         System.out.println(exp2);
//     }
// }            // output: 5,4 
          


// (2)

// public class operators {
//     public static void main(String[] args) {
//         int x = 200, y = 50, z = 100;
//         if(x > y && y < z) {
//             System.out.println("Hello");
//         } 
//         if (z > y && z < x) {
//             System.out.println("java");
//         }
//         if ((y+200) < x && (y+150) < z) {
//             System.out.println("Hello java");
            
//         }
//     }
// }             //output: Hello java


// (3)

// public class operators {
//     public static void main(String[] args) {
//         int x, y, z;
//         x = y = z = 2;
//         x += y;
//         y -= z;
//         z /= (x +y);
//         System.out.println(x + " " + y + " " + z);
//     }
// }             // output: 4 0 0


// (4)

// public class operators {
//     public static void main(String[] args) { 
//         int x = 9, y =12;
//         int a = 2, b = 4, c = 6;
//         int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);

//         System.out.println(exp);
//     }       
// }             // output: 278


// (5)  

// public class operators {
//     public static void main(String[] args) {
//         int x = 10, y = 5;

//         int exp1 = (y * (x / y + x / y));        // 5 * (10 / 5 + 10 / 5) = 5 * (2 + 2) = 5 * 4 = 20
//         int exp2 = (y * x / y + y * x / y);      // (5 * 10) / 5 + (5 * 10) / 5 = 10 + 10 = 20
//         System.out.println(exp1);
//         System.out.println(exp2);
//     }
// }             // output: 20,20


// END OPERATORS //