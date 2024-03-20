/*Question:
Write a program that prints the last index of a given character in a given string.

Example:
String: ""hello world""
Character: 'o'
Last Index: 7 */
import java.util.Scanner;
public class ChallengeDay26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string : ");
        str = scan.nextLine();
        System.out.print("Enter a letter to search last index in above string : ");
        char ch=  scan.next().charAt(0);
        scan.close();
        int index = str.lastIndexOf(ch);
        if(index==-1)
            System.out.print("Character "+ch+" not found in string "+str+".!!!");
        else
            System.out.print("Last index of "+ch+" in string "+str+" is : "+index);
    }
}
