import java.util.Scanner;
/**
 Question:
Write a program that reverses a given string.
Example:
Input: ""hello""
Output: ""olleh""
 */
public class ChallengeDay19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word to reverse : ");
        StringBuffer str = new StringBuffer();
        str.append(scan.next());
        scan.close();
        str.reverse();
        System.out.print("The reversed String is : ");
        System.out.print(str);
    }
}