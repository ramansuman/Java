/*Question:
Write a program that takes an integer n as input and prints all the factors of n.

Example:
Input: 12
Output: 1, 2, 3, 4, 6, 12
 */
import java.util.Scanner;

public class challengeDay2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a number to find all of its factors : ");
        int num=scan.nextInt();
        System.out.println("All the factors of input number is: ");
        for (int i = 1; i <=num; i++) {
            if(num%i==0)
                System.out.print(i+" ");
        }
        scan.close();
    }
}
