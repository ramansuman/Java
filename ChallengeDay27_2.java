import java.util.Scanner;

public class ChallengeDay27_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a string to find substrings : ");
        str = scan.nextLine();
        scan.close();
        System.out.print("Substrings of String "+str+" is : ");
        substring(str);
    }
    static void substring(String str)
    {
        for(int i = 0;i<str.length();i++)
        {
            String resStr = new String();
            resStr+="\""+str.charAt(i);
            for (int j = i; j < str.length(); j++) {
                if(i!=j)
                    resStr+=str.charAt(j);
                if(i!=str.length()-1)
                System.out.print(resStr+"\", ");
                else
                System.out.print("\""+str.charAt(str.length()-1)+"\"");
            }
        }
    }
}
