/*Question:
Write a program to find the Highest Common Factor (HCF) of two numbers.

Example:
Numbers: 24, 36
HCF: 12
 */
import java.util.Scanner;
public class challengeDay6 {
    static public void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter two numbe to get HCF : ");
        System.out.print("Enter first number : ");
        n1=scan.nextInt();
        System.out.print("Enter second number : ");
        n2=scan.nextInt();
        printHcf(n1,n2);
        scan.close();
    }
    static void printHcf(int num1, int num2)
    {
        int hcf=0;
        int max=num1>num2?num1:num2;
        for (int i = 1; i<max; i++) {
            if(num1%i==0 && num2%i==0)
                hcf=i;
        }
        System.out.println("HCF of "+num1+" and "+num2+" is : "+ hcf);
    }
}
