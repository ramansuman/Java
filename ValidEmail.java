import java.util.Scanner;

/**
 * ValidEmail
 */
public class ValidEmail {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a email to validate : ");
        String str = scan.nextLine();
        System.out.println(validEmail(str.toLowerCase()));
        scan.close();
    }
    static String validEmail(String str) {
        if(str.charAt(0)<'a'||str.charAt(0)>'z')
            return "Invalid";
        String temp[] = str.split(" ");
        if(temp.length>1)
            return "Invalid";
        int countAt = 0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='@')
                countAt++;
        }
        if(countAt!=1)
            return "Invalid";
        String[] arr = str.split("@");
        int countDot=0;
        for (int i = 0; i < arr[1].length(); i++) {
            if(arr[1].charAt(i)=='.')
                countDot++;
        }
        if(countDot!=1)
            return "Invalid";
        String[] arr1 =arr[1].split("\\.");
        if(arr1[0].length()==0)
            return "Invalid";
        // System.out.println(arr1[0]);// what is this printing?
        if(!arr1[1].equals("com"))
            return "Invalid";
        for(int i=0;i<arr1[0].length();i++) {
            if(arr1[0].charAt(i)<'a'||arr1[0].charAt(i)>'z')
                return "Invalid";
        }
        return "Valid";
    }
}