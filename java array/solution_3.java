// program for finding index of two elements in an array which have sum equal to given element


import java.util.*;
public class solution_3{



    public static void main(String[] args){




        Scanner sc = new Scanner(System.in);


        System.out.print("enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sumElement;


        System.out.println("enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println("enter sumElement: ");
        sumElement = sc.nextInt();
        
        
        sc.close();


        for(int i= 0;i<9;i++){
                
            for(int j= 1 ; j<10;j++){

                if(arr[i] + arr[j] == sumElement){
                    System.out.println("index: " + i + " " + j);
                }



            }
        }
        
        

    }
}


















