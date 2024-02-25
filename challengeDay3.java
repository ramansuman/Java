/*Question:
Write a program that takes an integer n as input and checks whether it is a prime number or not.
Example:
Input: 7
Output: Prime
Your Task:
Implement a program to determine whether a given number is prime or not, and share your code in the comments below!
 */
import java.util.Scanner;
public class challengeDay3 {
    static void checkPrime(int number){
        int count=0;
        for (int i = 1; i <=number; i++) {
            if(number%i==0){
                count++;
            }
        }
        if (count==2) {
            System.out.println(number+" is a prime number");
        }
        else{
            System.out.println(number+" is not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime number or not. : ");
        int num = scan.nextInt();
        checkPrime(num);
        scan.close();
    }
}
