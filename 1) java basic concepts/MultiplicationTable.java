// Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number:");
        int n = sc.nextInt();

        sc.close();

        for(int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}


// **************************************************************************************************************************

// import java.util.Scanner;
 
// public class MultiplicationTable{
 
//  public static void main(String[] args) {
//   Scanner in = new Scanner(System.in);
   
//   System.out.print("Input a number: ");
//   int num1 = in.nextInt();
   
//   for (int i=0; i< 10; i++){
//    System.out.println(num1 + " x " + (i+1) + " = " + 
//      (num1 * (i+1)));
//   }
//  }
// }







// *****************************************************************************************************************************************

// import java.util.Scanner;

// public class MultiplicationTable{

//  public static void main(String[] args) {
//   Scanner in = new Scanner(System.in);
//   System.out.println("Input the Number: ");
//   int n = in .nextInt();
//   for (int i = 1; i <= 10; i++) {
//    System.out.println(n + "*" + i + " = " + (n * i));
//   }
//  }
// }