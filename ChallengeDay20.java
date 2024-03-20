/*Question:
Write a program that checks if a given string is a palindrome or not.

Example:
String: "racecar"
Output: Palindrome
 */

import java.util.Scanner;

public class ChallengeDay20 {
    public static void main(String[] args) {
        String str = new String();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word to check if it is a palindrome : ");
        str =scan.nextLine();
        scan.close();
        String str1 = reverse(str);
        System.out.println(str.equals(str1)?str+" is a Palindrome":str+" is not a Palindrome.");
    }
    static String reverse(String str)
    {
        String res=new String();
        for (int i = str.length()-1; i>=0 ; i--) {
            res+=str.charAt(i);
        }
        return res;
    }
}