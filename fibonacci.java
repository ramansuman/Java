//fibonacci series:- 0 1 1 2 3 5 8 13 21 34 ...
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any vlaue to print that number of series : ");
        int n= scan.nextInt();
        int a=0, b=1;
        int c;
        System.out.println("Created Febonacci series : ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 0; i <n-2; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        scan.close();
    }
}
