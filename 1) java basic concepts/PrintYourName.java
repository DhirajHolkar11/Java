// Write a Java program to print 'Hello' on screen and your name on a separate line


import java.util.*;
public class PrintYourName{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("enter your first name:");
String fname = sc.next();
System.out.print("enter your last name:");
String lname = sc.next();
sc.close();

System.out.println("hello");
System.out.println(fname +' '+ lname);


}
}





// *****************************************************************************************************************************************






// import java.util.Scanner;

// public class PrintYourName{
//   public static void main(String[] args) 
//   {
//     Scanner input = new Scanner (System.in);
//     System.out.print("Input your first name: ");
//     String fname = input.next();
//     System.out.print("Input your last name: ");
//     String lname = input.next();
//     input.close();
//     System.out.println();
//     System.out.println("Hello \n"+fname+" "+lname);
//   }
// }


