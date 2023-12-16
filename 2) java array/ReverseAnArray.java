// java program for reversing an array


import java.util.Scanner;

public class ReverseAnArray{
    public static void main(String args[])    {

            Scanner sc = new Scanner(System.in);
            System.out.print("enter size of array:");
            int n = sc.nextInt();


            int arr[] = new int[n];
            System.out.print("enter array elements:");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            sc.close();


            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();


            if(n%2==0){
                int temp1;
                for(int i=0; i<(n/2); i++){
                    temp1 = arr[i];
                    arr[i] = arr[n-1-i];
                    arr[n-1-i] = temp1;
                }
            }
            else{
                int temp2;
                for(int i=0; i<(n-1)/2; i++){
                    temp2 = arr[i];
                    arr[i] = arr[n-1-i];
                    arr[n-1-i] = temp2;
                }
            }
            
            
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
        
        
    }


}
