// java program for finding the sum of the array elements


import java.util.Scanner;


public class SumOfArrayElements{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("enter array elements:");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        sc.close();


        int sum = 0;

        for(int j=0; j<n; j++){
            sum = arr[j] + sum;
        }

        System.out.println("sum of array elements is:" + sum);

    }
}
