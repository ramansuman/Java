/*Question:
Write a program that prints the occurrences of all elements in a sorted array.

Example:
Array: [1, 1, 1, 2, 3, 3, 5, 5, 5, 6]
Occurrences:
1 - 3 
2 - 1 
3 - 2 
5 - 3
6 - 1
*/
import java.util.Scanner;

public class challengeDay14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n= scan.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value at index "+i+" : ");
            arr[i]=scan.nextInt();
        }
        scan.close();
        countRepeat(arr);
    }
    static void countRepeat(int[] arr)
    {
        int count=1;
        System.out.println("Occurance of each element is :");
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i])
            {
                count++;
            }
            else
            {
                System.out.println(arr[i-1]+"-"+count);
                count=1;
            }
        }
        System.out.println(arr[arr.length-1]+"-"+count);
    }
}
