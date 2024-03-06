/*Question:
Write a program that prints all the pairs in an array.

Example:
Array: [1, 2, 3, 4, 5]
Pairs: (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 4), (3, 5), (4, 5) */
import java.util.Scanner;
public class challengeDay11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of new array : ");
        int n=scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the value of array at index "+i+" : " );
            a[i]=scan.nextInt();
        }
        scan.close();
        System.out.println("All the pairs which can be created by the new array are : ");
        printArrayPair(a);
    }
    static void printArrayPair(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+", "+arr[j]+")");
                if(i!=arr.length-1)
                    System.out.print(", ");
            }
        }
    }
}
