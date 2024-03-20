import java.util.Scanner;

public class ChallengeDay25_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string : ");
        str = scan.nextLine();
        System.out.print("Enter a character to search in the above string : ");
        char ch = scan.next().charAt(0);
        scan.close();
        int index = searchChar(str,ch);
        if(index==-1)
            System.out.print(ch+" is not present in the string "+str);
        else
            System.out.print("index of "+ch+" in "+str+" is "+index);
    }
    static int searchChar(String str, char ch) {
        int  index=-1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch)
                index=i;
            }
        return index;
    }
}
