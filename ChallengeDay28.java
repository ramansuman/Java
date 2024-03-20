/*Question:
Write a program that checks whether two strings are equal without using any inbuilt methods.
Example:
String 1: "hello"
String 2: "hello"
Output: Equal */
import java.util.Scanner;
public class ChallengeDay28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = new String();
        System.out.print("Enter first string  : ");
        str1= scan.nextLine();
        String str2 = new String();
        System.out.print("Enter second String : ");
        str2 = scan.nextLine();
        scan.close();
        System.out.println(compareString(str1,str2)?str1+" and "+str2+" are equal":str1+" and "+str2+" are Unequal");
    }
    static boolean compareString(String str1,String str2) {
        for(int i=0;i<str1.length()&&i<str2.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
                return false;
        }
        if(str1.length()!=str2.length())
            return false;
        return true;
    }
}
