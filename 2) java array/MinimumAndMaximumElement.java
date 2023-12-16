// program for finding largest element in an array


import java.util.*;
public class MinimumAndMaximumElement{

    public static void main(String[] args){
    

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("enter elements:");

        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();        
        }

        sc.close();
        int sab1=arr[0];

        for(int i=0; i<10; i++){
            if(sab1<arr[i]){
                sab1 = arr[i];
            }
        }

        System.out.println("the largest element is: " + sab1);

    }



}











// // program for finding smallest element in an array



// import java.util.*;
// public class MinimumAndMaximumElement{

//     public static void main(String[] args){
    

//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[10];
//         System.out.println("enter elements:");

//         for(int i=0;i<10;i++){
//             arr[i]= sc.nextInt();        
//         }

//         sc.close();
//         int sab1=arr[0];

//         for(int i=0; i<10; i++){
//             if(sab1>arr[i]){
//                 sab1 = arr[i];
//             }
//         }

//         System.out.println("the smallest element is: " + sab1);

//     }



// }

