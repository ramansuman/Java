/*Question:
Write a program that counts the occurrences of an element in an array.

Example:
Array: [1, 2, 3, 2, 2, 4, 5]
Element to Count: 2
Occurrences: 3 */
import java.util.Scanner;
public class challengeDay10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of new array : ");
        int n=scan.nextInt();
        int[] a= new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the value in array at index "+i+ " : ");
            a[i]=scan.nextInt();
        }
        System.out.print("Enter the digit to check occurance : ");
        int b=scan.nextInt();
        scan.close();
        countOcurrence(a,b);
    }
    static void countOcurrence(int arr[],int inputDigit)
    {
        int count=0;
        System.out.print("Created array is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            if(arr[i]==inputDigit)
                count++;
        }
        System.out.println();
        if(count==0)
            System.out.println("Entered input digit is not occuring in the created array!!!");
        else
            System.out.println(inputDigit+" is occuring "+count+" times in the created array.");
    }
}
