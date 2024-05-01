/*
Question:
Write a program that prints the occurrence of each character in a given string.

Example:
Input: "mississippi"
Output: m - 1, i - 4, s - 4, p - 2 */
import java.util.Scanner;

public class ChallengeDay30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = new String();
        System.out.print("Enter a string to count each character : ");
        input= scan.nextLine();
        scan.close();
        countCharacterOccurrences(input);
    }
    public static void countCharacterOccurrences(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            int count = 1;
            if (ch != ' ') {
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[j] == ch) {
                        count++;
                        charArray[j] = ' ';
                    }
                }
                System.out.print(ch + " - " + count+",");
            }
        }
    }
}