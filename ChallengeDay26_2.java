import java.util.Scanner;
public class ChallengeDay26_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =new String();
        System.out.print("Enter a string : ");
        str = scan.nextLine();
        System.out.print("Enter a character to search in the above string : ");
        char ch = scan.next().charAt(0);
        scan.close();
        searchCharacter(str,ch);
    }
    static void searchCharacter(String str, char ch) {
        int lastIndex =-1;
        for(int i = str.length()-1;i>=0;i--) {
            if(str.charAt(i)==ch) {
                lastIndex=i;
                break;
            }
        }
        if(lastIndex==-1)
            System.out.print("The character "+ch+" is not available in string "+str);
        else
            System.out.print("The last index of "+ch+" in string "+str+" is : "+lastIndex);
    }
}
