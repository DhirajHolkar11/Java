// Write a Java program to divide two numbers and print them on the screen.



import java.util.*;
public class DivideTwoNumbers{

public static void main(String[] args){


    Scanner sc = new Scanner(System.in);

    System.out.print("enter number1:");
    int num1 = sc.nextInt();

    System.out.print("enter number2:");
    int num2 = sc.nextInt();

    sc.close();


    int solution = num1/num2;
    System.out.println("solution is: " + solution);

}    
}






// ****************************************************************************************************************************************



// import java.util.Scanner;

// public class DivideTwoNumbers{
//   public static void main(String[] args) 
//   {
//     Scanner input = new Scanner (System.in);
//     System.out.print("Input the first number: ");
//     int a = input.nextInt();
//     System.out.print("Input the second number: ");
//     int b = input.nextInt();
//     input.close();
//     int d = (a/b);
//     System.out.println();
//     System.out.println("The division of a and b is:" +d);
//   }
// }