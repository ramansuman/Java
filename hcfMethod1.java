import java.util.Scanner;
public class hcfMethod1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to find HCF : ");
        System.out.print("Enter the First number : ");
        int a = scan.nextInt();
        System.out.print("Enter the second number : ");
        int b = scan.nextInt();
        scan.close();
        printHcf(a,b);
    }
    static void printHcf(int num1,int num2)
    {
        System.out.print("The HCF of "+ num1+" and "+num2+" is : ");
        while(num1>num2||num2>num1)
        {
            if(num1>num2)
                num1=num1-num2;
            else
                num2=num2-num1;
        }
        if(num1>num2)
            System.out.print(num1);
        else
            System.out.print(num2);
    }
}