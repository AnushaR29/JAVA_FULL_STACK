package Day8;

import java.util.Scanner;

public class Frequency_Array {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        int count[] = new int [100];
        int arr[] = new int [size];

        System.out.println("Enter the elements: ");

         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();    
        }

        for (int i = 0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        for(int i = 0;i< count.length; i++)
        // for(int i = count.length-1;i>=0; i--)
        {
	       if(count[i]>1){
	       System.out.print(i + " ");
        }
    }
    }
    
}


// Anusha.R 22CS054

// 42. Sorting numbers by occurrence: 3 3 4 4 4 5 5 5 1 2

// OUTPUT :

// Enter the Array Size : 10
// Enter the elements: 
// 3 3 4 4 4 5 5 5 1 2
// 1 2 3 3 4 4 4 5 5 5