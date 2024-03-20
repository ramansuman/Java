/*Question:
Write a program that prints the unique elements in a sorted array.

Example:
Sorted Array: [1, 2, 2, 3, 4, 5, 5, 5]
Unique Elements: 1, 3, 4
 */

import java.util.Scanner;

public class challengeDay15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array needed : ");
        int n=scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value at index "+i+" : ");
            arr[i]=scan.nextInt();
        }
        scan.close();
        printUniqueElement(arr);
    }
    static void printUniqueElement(int[] arr)
    {
        int count=1;
        System.out.println("Unique element in the Array are :");
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i])
            {
                count++;
            }
            else
            {
                if(count==1)
                    System.out.print(arr[i-1]+" ");
                count=1;
            }
        }
        if(count==1)
            System.out.print(arr[arr.length-1]);
    }
}
