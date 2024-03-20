import java.util.Scanner;

public class ChallengeDay19_2 {
    public static void main(String[] args) {
        String str = new String();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word to reverse : ");
        str = scan.next();
        scan.close();
        String revString = reverse(str);
        System.out.print("The reversed String is : "+revString);
    }
    static String reverse(String str)
    {
        String newStr = new String();
        for (int i = str.length()-1; i>=0; i--) {
            newStr+=str.charAt(i);
        }
        return newStr;
    }
}
