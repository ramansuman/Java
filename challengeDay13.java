import java.util.Scanner;

/*
 Question:
Write a program that prints the largest repeating element in a sorted array.

Example:
Input:
Array: [1, 1, 1, 2, 3, 3, 5, 5, 5]
Output: 5
 */
public class challengeDay13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array needed : ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value at index "+i+" : ");
            arr[i]=scan.nextInt();
        }
        scan.close();
        if(largestRepeatingElement(arr))
            System.out.println("!!! No repeating vlaue in array !!!");
    }
    static boolean largestRepeatingElement(int[] arr)
    {
        for (int i = arr.length-1; i >0; i--) {
            if(arr[i]==arr[i-1])
            {
                System.out.println("The largest repeating value is : "+arr[i]);
                return false;
            }
        }
        return true;
    }
}