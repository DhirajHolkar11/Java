// program for finding smallest element in an array


import java.util.Scanner;
public class solution_1{

    public static void main(String[] args){
    

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("enter elements:");

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();        
        }

        sc.close();
        int smallElement = arr[0];

        for(int i=0; i<n; i++){
            if(smallElement > arr[i]){
                smallElement = arr[i];
            }
        }

        System.out.println("the smallest element is: " + smallElement);

    }



}


