import java.util.Scanner;

public class swap2 {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number in variable a: ");
        a=scan.nextInt();
        System.out.print("Enter a number in variable b: ");
        b=scan.nextInt();
        System.out.println("BEFORE SWAPPING :");
        System.out.println("Value of variable a :"+a+"\nValue of variable b:"+b);
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("AFTER SWAPPING :");
        System.out.println("Value of variable a :"+a+"\nValue of variable b:"+b);
        scan.close();
    }
}
