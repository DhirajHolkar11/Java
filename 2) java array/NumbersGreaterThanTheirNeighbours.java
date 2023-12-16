// java program to find the numbers in an array that are greater than their neighbours

import java.util.Scanner;
public class NumbersGreaterThanTheirNeighbours{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter elements of array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }




        sc.close();

        for(int j=0; j<n; j++){
            if(j==0){
                if(arr[j]>arr[j+1]){
                    System.out.println("index:"+ j + " & " + "element:" + arr[j]);
                }
            }
            
            else if(j==n-1){
                if(arr[j]>arr[j-1]){
                    System.out.println("index:"+ j + " & " + "element:" + arr[j]);
                }
            }
            
            else{
                if(arr[j]>arr[j-1] && arr[j]>arr[j+1]){
                    System.out.println("index:"+ j + " & " + "element:" + arr[j]);
                    
                }
            }
        }

    }
}
