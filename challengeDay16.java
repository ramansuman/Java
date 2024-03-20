/*Question:
Write a program that prints all the subarrays of an array.

Example:
Array: [1, 2, 3]
Subarrays:
[1]
[1, 2]
[1, 2, 3]
[2]
[2, 3]
[3]
 */

import java.util.Scanner;

public class challengeDay16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array needed : ");
        int n=scan.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value at index "+ i+" : ");
            arr[i]= scan.nextInt();
        }
        scan.close();
        subArrays(arr);
    }
    static void subArrays(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            String str = new String();
            str+= "["+arr[i];
            for (int j = i; j < arr.length; j++) {
                if(i!=j)
                    str+=", "+arr[j];
                System.out.println(str+"]");
            }
        }
    }
}
