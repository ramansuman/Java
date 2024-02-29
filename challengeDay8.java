/*Question:
Write a program that calculates the sum of all elements present in an array.

Example:
Array: [1, 2, 3, 4, 5]
Sum: 15
*/
import java.util.Scanner;
public class challengeDay8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of values to be added : ");
        int n=scan.nextInt();
        sumArr(n);
        scan.close();
    }
    static void sumArr(int num)
    {
        int sum=0;
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at position " + i+" : ");
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of all the entered numbers is "+sum);
        scan.close();
    }
    
}
