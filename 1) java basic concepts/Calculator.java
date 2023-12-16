// java program for calculator


import java.util.*;
public class Calculator{


 public static void func1(int a, int b, char c){

    int output;

    switch(c){
        
        case '+':
        output = a+b;
        System.out.println("addition is: "+ output);
        break;
        
        case '-':
        output = a-b;
        System.out.println("subtraction is: "+ output);
        break;
        
        case '*':
        output = a*b;
        System.out.println("multiplication is: "+ output);
        break;
        
        case '/':
        output = a/b;
        System.out.println("division is: "+ output);
        break;

        default: 
        System.out.println("unknown operator");
        break;


    }
 }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("enter two numbers and an operator: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operator = sc.next().charAt(0);
        
        sc.close();        
    

        func1(num1, num2, operator);
    


    }
}




