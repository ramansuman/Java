/*
Question:
Write a program that takes an integer n as input and checks if it is a palindrome number.

Example:
Input: 12321
Output: Palindrome */
import java.util.Scanner;
class challengeDay7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.print("Enter a number to check if it is palindrome or not : ");
        n=scan.nextInt();
        checkPalindrome(n);
        scan.close();
    }
    static void checkPalindrome(int num)
    {
        int digit;
        int temp=num;
        int rev=0;
        while(temp!=0)
        {
            digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        if(rev==num)
            System.out.println(num+" is a palindrome number.");
        else
            System.out.println(num+" is not a palindrome number.");
    }
}