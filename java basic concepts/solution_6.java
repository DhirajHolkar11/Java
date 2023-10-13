// Write a Java program to print the addition, multiplication, subtraction, division and remainder of two numbers.


import java.util.Scanner;
public class solution_6{
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
