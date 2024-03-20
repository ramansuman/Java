/*Question:
Write a program that converts a given string according to the following rules and prints the output:

Place '#' before vowels in the string.
Example:
Input: "Tap Academy"
Output: "T#ap #Ac#ad#emy"
 */

import java.util.Scanner;

public class ChallengeDay24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string value to put a # beside vowels : ");
        str = scan.nextLine();
        scan.close();
        convertString(str);
    }
    static void convertString(String str) {
        String newString = new String();
        for (int i = 0; i < str.length(); i++) {
            char x=str.charAt(i);
            if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
                newString+="#"+x;
            else
                newString+=x;
        }
        System.out.print(newString);
    }
}
