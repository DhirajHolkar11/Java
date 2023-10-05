// Write a Java program to divide two numbers and print them on the screen.



import java.util.*;
public class solution_3{

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

