// Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;
public class solution_7 {
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
