import java.util.Scanner;
public class AApractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("String: "); 
        String n = scan.nextLine();
        scan.close();
        String output = removeSpecialChar (n);
        System.out.println("Output:" +output);
    }

public static String removeSpecialChar (String str) {
    String output = new String();
    for (int i=0;i<str.length();i++) {
    char ch=str.charAt(i);
    if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
        output += ch;
}

return output;
}
}