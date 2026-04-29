
// print Hollow Reactangle pattern //

// public class Patterns2 {
//     public static void hollow_rectangle(int totRows, int totcols) {
//         // outer loop

//         for(int i=1; i<=totRows; i++) {
//             // inner - columns
//             for(int j=1; j<=totcols; j++) {
//                 // cell -(i,j)
//                 if (i == 1 || i == totRows || j == 1 || j ==totcols) {
//                     // boundary cells
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }    

//     public static void main(String[] args) {
//         hollow_rectangle(4, 5);
//     }
// }


// INVERTED  & ROTATED HALF PYRAMID PATTERN //

// public class Patterns2 {
//     public static void inverted_rotated_half_pyramid(int n) {
//         // outer loop
//         for(int i=1; i<=n; i++) {
//             // spaces
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             // stars
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }    

//     public static void main(String[] args) {
//         inverted_rotated_half_pyramid(5);
//     }
// }


// INVERTED HALF PYRAMID WITH NUMBERS//

// public class Patterns2 {
//     public static void inverted_half_pyramid_with_numbers(int n) {
//         // outer loop
//         for(int i=1; i<=n; i++) {
//             // numbers
//             for(int j=1; j<=n-i+1; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }    

//     public static void main(String[] args) {
//         inverted_half_pyramid_with_numbers(5);
//     }
//}



