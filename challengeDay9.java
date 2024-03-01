/*Question:
Write a program that finds the largest element present in an array.

Example:
Array: [5, 10, 3, 8, 15]
Largest Element: 15
*/

import java.util.*;
public class challengeDay9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of new array : ");
        int n=scan.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elments in array : ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=scan.nextInt();
        }
        scan.close();
        maxVal(a);
    }
    static void maxVal(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.print("The maximum value entered in array is : "+max);
    }
}
