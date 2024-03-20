/*Question:
Write a program that prints the number of vowels in a given string.

Example:
String: "Hello World"
Number of Vowels: 3 */

import java.util.Scanner;

public class ChallengeDay21 {
    public static void main(String[] args) {
        String str = new String();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string to count the number of vowels : ");
        str= scan.nextLine();
        int count = countVowel(str);
        scan.close();
        System.out.print("The number of vowels in "+str+" is "+count);
    }
    static int countVowel(String str)
    {
        int count =0;
        for (int i =0; i<str.length(); i++) {
            char x = str.toLowerCase().charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
                count++;
        }
        return count;
    }
}