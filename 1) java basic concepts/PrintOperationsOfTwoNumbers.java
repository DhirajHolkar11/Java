// Write a Java program to print the addition, multiplication, subtraction, division and remainder of two numbers.


import java.util.Scanner;
public class PrintOperationsOfTwoNumbers{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number1:");
        int number1 = sc.nextInt();
        
        System.out.println("enter number2:");
        int number2 = sc.nextInt();

        sc.close();

        System.out.println("addition:" + (number1+number2));
        System.out.println("subtraction:" + (number1-number2));
        System.out.println("multiplication:" + (number1*number2));
        System.out.println("division:" + (number1/number2));
        System.out.println("remainder:" + (number1%number2));
    }

}










// ***************************************************************************************************************************************

// import java.util.Scanner;
 
// public class PrintOperationsOfTwoNumbers{
 
//  public static void main(String[] args) {
//   Scanner in = new Scanner(System.in);
   
//   System.out.print("Input first number: ");
//   int num1 = in.nextInt();
   
//   System.out.print("Input second number: ");
//   int num2 = in.nextInt();
   
 
//   System.out.println(num1 + " + " + num2 + " = " + 
//   (num1 + num2));
   
//   System.out.println(num1 + " - " + num2 + " = " + 
//   (num1 - num2));
   
//   System.out.println(num1 + " x " + num2 + " = " + 
//   (num1 * num2));
   
//   System.out.println(num1 + " / " + num2 + " = " + 
//   (num1 / num2));
 
//   System.out.println(num1 + " mod " + num2 + " = " + 
//   (num1 % num2));
//  }
 
// }








// ********************************************************************************************************************************

// import java.util.Scanner;
// public class PrintOperationsOfTwoNumbers{
//  public static void main(String[] args) {
//   Scanner scanner = new Scanner(System.in);
//   System.out.println("Input the first number: ");
//   int n1 = scanner.nextInt();
//   System.out.println("Input the second number: ");
//   int n2 = scanner.nextInt();
//   int sum = n1 + n2;
//   int minus = n1 - n2;
//   int multiply = n1 * n2;
//   int subtract = n1 + n2;
//   int divide = n1 / n2;
//   int rnums = n1 % n2;
//   System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, rnums);
//  }
// }
