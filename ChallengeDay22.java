/*Question:
Write a program that removes all the special characters from a given string.

Example:
String: "Hello! @World#"
Output: "HelloWorld"
*/

import java.util.Scanner;

public class ChallengeDay22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string including symbols, to eleminate : ");
        str = scan.nextLine();
        scan.close();
        System.out.print("String without symbols is : ");
        removeSpecialCharacter(str);
    }
    static void removeSpecialCharacter(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if((ch>64&&ch<91)||(ch>96&&ch<123))
            {
                System.out.print(ch);
            }
        }
    }
}
