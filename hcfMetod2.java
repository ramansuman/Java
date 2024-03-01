import java.util.Scanner;
public class hcfMetod2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to find HCF : ");
        System.out.print("Enter the first number : ");
        int a= scan.nextInt();
        System.out.print("Enter the Second number : ");
        int b= scan.nextInt();
        scan.close();
        printHcf2(a,b);
    }
    static void printHcf2(int num1,int num2)
    {
        System.out.print("The HCF of "+num1+" and "+num2+" is : ");
        while(num1>0&&num2>0)
        {
            if(num1>num2)
                num1=num1%num2;
            else
                num2=num2%num1;
        }
        if(num1==0)
            System.out.print(num2);
        else
            System.out.print(num1);
    }
}
