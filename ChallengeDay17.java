/*Question:
Write a program that prints the sum of all subarrays whose sum is equal to k.

Example:
Array: [5, 2, 3, 4, 1]
Target Sum: 10
Subarrays with Sum 8:
[5, 2, 3]
[2, 3, 4, 1]
 */

import java.util.Scanner;

public class ChallengeDay17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array needed : ");
        int n= scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value in array at index "+i+" : ");
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the target sum needed : ");
        int sum = scan.nextInt();
        scan.close();
        subArraySum(arr, sum);
    }
    static void subArraySum(int[] arr, int sum)
    {
        for (int i = 0; i < arr.length; i++) {
            String str = new String();
            int tempSum=0;
            str+= "["+arr[i];
            tempSum+= arr[i];
            for (int j = i; j < arr.length; j++) {
                if(i!=j)
                {
                    tempSum+=arr[j];
                    str+=", "+arr[j];
                }
                if(tempSum==sum)
                    System.out.println(str+"]");
            }
        }
    }
}
