/*Question:
Write a program that prints a given string in reverse order, while keeping each word intact.
Example:
Input: "Welcome to TAP Academy"
Output: "emocleW ot PAT ymedacA" */
import java.util.Scanner;
public class CHallengeDay29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.nextLine();
        System.out.print("String after reversing each words character : ");
        reverseString(str);
        scan.close();
    }
    static void reverseString(String str) {
        String res = new String();
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String str1 =arr[i];
            for (int j=str1.length()-1;j>=0;j--) {
                char ch = str1.charAt(j);
                res+=ch;
            }
            res+=" ";
            // System.out.println(arr[i]);
        }
        System.out.println(res);
    }
}
