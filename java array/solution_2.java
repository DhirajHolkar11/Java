// program for finding largest element in an array


import java.util.*;
public class solution_2{

    public static void main(String[] args){
    

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("enter elements:");

        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();        
        }

        sc.close();
        int largestElement = arr[0];

        for(int i=0; i<10; i++){
            if(largestElement<arr[i]){
                largestElement = arr[i];
            }
        }

        System.out.println("the largest element is: " + largestElement);

    }



}





