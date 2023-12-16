// java program for sorting an array 


import java.util.Scanner;
import java.util.Arrays;

public class SortAnArray{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the elements of array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(arr);

        System.out.println("sorted array:");

        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}