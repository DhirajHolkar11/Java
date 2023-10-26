// find the occurance of an integer in the array


import java.util.Scanner;
public class solution_7{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array:");
        int arraySize = sc.nextInt();

        int arr[] = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter which numbers occurance you want to check:");
        int targetElement = sc.nextInt();

        sc.close();

        int count = 0;

        for(int i = 0; i < arraySize; i++){
            if(arr[i] == targetElement ){
                count = count + 1;
            }
        }

        System.out.println(" the element " + targetElement + " occurs " + count + " times ");

    }    
}
