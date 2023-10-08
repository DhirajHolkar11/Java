// Write a Java program that takes two numbers as input and displays the product of two numbers.


import java.util.Scanner;

public class solution_5{
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
