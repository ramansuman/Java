/*Question:
Write a program that prints all pairs from an array whose difference is equal to k.

Example:
Array: [9, 5, 6, 1, 2]
Difference: 4
Pairs: (9, 5), (5, 1), (6, 2)*/
import java.util.Scanner;
public class challengeDay12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of new array : ");
        int n=scan.nextInt();
        System.out.println("Enter the difference needed : ");
        int k=scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the value of array at index "+i+" : " );
            a[i]=scan.nextInt();
        }
        scan.close();
        System.out.println("All the pairs which can be created by the new array are : ");
        printArrayPair(a,k);
    }
    static void printArrayPair(int arr[],int diff)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]-arr[j])==diff||(arr[j]-arr[i])==diff)
                {
                    System.out.print("("+arr[i]+", "+arr[j]+")");
                    if(i!=arr.length-1&&j!=arr.length-1)
                        System.out.print(", ");
                }
            }
        }
    }
}
