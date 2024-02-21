import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the first number to store in variable a : ");
        a=scan.nextInt();
        System.out.print("Enter the second number to store in variable b : ");
        b=scan.nextInt();
        System.out.println("BEFORE SWAPPING : ");
        System.out.println("Value in variable a: "+a+"\nValue in variable b: "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("AFTER SWAPPING : ");
        System.out.println("Value in variable a: "+a+"\nValue in variable b: "+b);
        scan.close();
    }
}
