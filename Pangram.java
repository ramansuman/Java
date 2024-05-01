//check pangram

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(checkPangram(input));
        scan.close();
    }
    static String checkPangram(String input)
    {
        if(input.length()<26)
        {
            return "not pangram";
        }
        else
        {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                boolean check = false;
                for (int i = 0; i < input.length(); i++) {
                    if(ch==input.charAt(i))
                    {
                        check=true;
                        break;
                    }
                }
                if(check==false)
                    return "not pangram";
            }
        }
        return "pangram";
    }
}