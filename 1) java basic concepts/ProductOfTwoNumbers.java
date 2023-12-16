// Write a Java program that takes two numbers as input and displays the product of two numbers.

// Test Data:
// Input first number: 25
// Input second number: 5




import java.util.Scanner;

public class ProductOfTwoNumbers{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number 1:");
        int num1 = sc.nextInt();

        System.out.print("enter number 2:");
        int num2 = sc.nextInt();

        sc.close();

        int product = num1*num2;
        System.out.println(product);



    }

}






// **********************************************************************************************************************************************



// import java.util.Scanner;
 
// public class ProductOfTwoNumbers{
 
//  public static void main(String[] args) {
//   Scanner in = new Scanner(System.in);
   
//   System.out.print("Input first number: ");
//   int num1 = in.nextInt();
   
//   System.out.print("Input second number: ");
//   int num2 = in.nextInt();
   
//   System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
//  }
 
// }
