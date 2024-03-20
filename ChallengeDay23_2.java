/*Question:
Write a program that swaps the cases of characters in a given string.

Example:
String: "Hello World"
Output: "hELLO wORLD"
*/
import java.util.Scanner;
public class ChallengeDay23_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string to reverse the case of letters : ");
        str= scan.nextLine();
        scan.close();
        stringReverseCase(str);
    }
    static void stringReverseCase(String str){
        String resultString = new String();
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i);
            if(x>64&&x<97)
                resultString+=(char)(x+32);
            else if(x>96&&x<123)
                resultString+=(char)(x-32);
            else if(x==32)
                resultString+=" ";
        }
        System.out.println(resultString);
    }
}
