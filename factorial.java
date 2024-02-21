import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial:- ");
        int num= scan.nextInt();
        long facto=1;
        for (int i = 1; i <=num; i++) {
            facto*=i;
        }
        System.out.println("Factorial of "+ num + " is : "+ facto);
        scan.close();
    }
}
