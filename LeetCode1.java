import java.util.Scanner;

public class LeetCode1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string to be allowed :");
        String allowed = scan.next();
        System.out.println("Enter the size of word arrray : ");
        int n = scan.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=scan.next();
        }
        countAllowedPresent(allowed,arr);
    }
    static void countAllowedPresent(String allowed, String arr[]) {
        int count=0;
        loop1 : for(int i=0;i<arr.length;i++) {
            String str = arr[i];
            loop2 : for(int j=0;j<str.length();j++) {
                char ch= str.charAt(j);
                boolean check1 =false;
                for(int k=0;k<allowed.length();k++) {
                    if(ch==allowed.charAt(k))
                    {
                        check1=true;
                        continue loop2;
                    }
                }
                if(check1==false) {
                    count++;
                    continue loop1;
                }
            }
        }
        System.out.println(arr.length-count);
    }
}
