// Write a Java program to print the sum of two numbers.


import java.util.*;

public class solution_2{
    
public static void main(String[] args){


    Scanner sc = new Scanner(System.in);
    System.out.print("enter number1:");
    int num1 = sc.nextInt();
    System.out.print("enter number2:");
    int num2 = sc.nextInt();
    sc.close();

    int sum = num1 + num2;
    System.out.println("sum is:" +' '+sum); 

}

}
