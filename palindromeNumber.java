import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter a number to check weather it is palindrome or not :");
        num=scan.nextInt();
        int count=0;
        int temp=num;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        // System.out.println(count);
        temp=num;
        int digit,rev=0;
        for (int i = count; i >=1; i--) {
            digit=temp%10;
            temp=temp/10;
            rev+=digit*Math.pow(10,i-1);
        }
        // System.out.println(rev);
        if(rev==num)
            System.out.println(num+" is a palindrome number");
        else
            System.out.println(num+" is not a palindrome number");
        scan.close();
    }
}
