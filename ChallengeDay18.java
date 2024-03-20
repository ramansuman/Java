/*Question:
Write a program that prints the largest subarray whose sum is equal to k.

Example:
Array: [1, 2, 3, 4, 5]
Target Sum: 9
Largest Subarray with Sum 9: [2, 3, 4]
*/

import java.util.Scanner;

public class ChallengeDay18 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value at index "+i+" : ");
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the sum needed : ");
        int k = scan.nextInt();
        scan.close();
        largestSubArrayWithSum(arr,k);
    }

    static void largestSubArrayWithSum(int[] arr, int k) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int l = i; l <=j; l++) {
                    sum+=arr[l];
                }
                if (sum==k) {
                    String str = new String();
                    str+="["+arr[i];
                    for (int l = i+1; l <=j; l++) {
                        str+=", "+arr[l];
                    }
                    System.out.println(str+="]");
                    return;
                }
            }
        }
    }
}