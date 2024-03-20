/*Question:
Write a program that prints the index of a given character in a given string.

Example:
String: "hello"
Character: 'o'
Index: 4
*/
import java.util.Scanner;

public class ChallengeDay25 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string : ");
        str = scan.nextLine();
        System.out.print("Enter a character to search the index of input string : ");
        char a= scan.next().charAt(0);
        scan.close();
        int index =  str.indexOf(a);
        if(index==-1)
            System.out.print(a+" is not present in the input String "+str);
        else
            System.out.print("index of "+a+" in "+str+" is "+index);
    }
}
