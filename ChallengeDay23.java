/*Question:
Write a program that swaps the cases of characters in a given string.

Example:
String: "Hello World"
Output: "hELLO wORLD"   */
import java.util.Scanner;
public class ChallengeDay23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string to reverse the case of letters : ");
        str= scan.nextLine();
        scan.close();
        stringReverseCase(str);
    }
    static void stringReverseCase(String str) {
        String resStr = new String();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(Character.isUpperCase(x))
                resStr+=Character.toLowerCase(x);
            else if(Character.isLowerCase(x))
                resStr+=Character.toUpperCase(x);
            else if(x==' ')
                resStr+=" ";
        }
        System.out.print("String after reversing case : "+resStr);
    }
}
