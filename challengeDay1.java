/*Question:
Write a program that takes an integer `n` as input and performs the following actions:
- If `n` is a multiple of 3, print 'TAP'.
- If `n` is a multiple of 5, print 'ACAD'.
- If `n` is a multiple of both 3 and 5, print 'FULLSTACK'.
- Otherwise, print the number itself.
 */
import java.util.Scanner;

public class challengeDay1 {
   public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = scan.nextInt();
    System.out.println(num%15==0?"FULLSTACK":num%3==0?"TAP":num%5==0?"ACAD":num);
    scan.close();
    }
}