/*Question:
Write a program that takes two integers, n1 and n2, as input and prints the first y common multiples of n1 and n2.

Example:
Input: n1 = 3, n2 = 5, y = 4
Output: 15, 30, 45, 60 */

import java.util.Scanner;

public class challengeDay5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n1,n2,y;
        System.out.println("ENTER TWO NUMBER TO FIND COMMON MULTIPLES :");
        System.out.print("Enter first number : ");
        n1=scan.nextInt();
        System.out.print("Enter second number : ");
        n2=scan.nextInt();
        System.out.print("Enter the number of output you needed : ");
        y=scan.nextInt();
        System.out.println(y+" Common multiples of "+n1+" and "+n2+" is : ");
        printMultiples(n1,n2,y);
        scan.close();
    }
    static void printMultiples(int num1,int num2,int val){
        for (int i = 1; i <=val; i++) {
            System.out.print(num1*num2*i+" ");
        }
    }
}
