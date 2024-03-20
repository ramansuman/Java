/*Question:
Write a program that prints all the substrings of a given string.

Example:
String: "abc"
Substrings: "a", "ab", "abc", "b", "bc", "c"
 */
import java.util.Scanner;
public class ChallengeDay27 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String str = new String();
         System.out.print("Enter a string to find all substrings : ");
         str = scan.nextLine();
         scan.close();
         System.out.print("All the substring of string "+str+" is : ");
         substring(str);
    }
    static void substring(String str) {
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j <= str.length()-i; j++) {
                System.out.print("\"");
                for (int k = j; k < j+i; k++) {
                    System.out.print(str.charAt(k)+"");
                }
                if(i!=str.length())
                System.out.print("\", ");
                else
                System.out.print("\"");
            }
        }
    }
}
