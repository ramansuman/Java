/*strong number: sum of factorial of all the digit in a number results to the actual number.
 145=1!+4!+5!=1+24+120=145 so it is strong number.
 */
import java.util.Scanner;
public class strong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check whether input number is Strong number or not.");
        int num= scan.nextInt();
        checkStrong(num);
        scan.close();
    }
    static void checkStrong(int num)
    {
        int temp=num;
        int res=0;
        int digit;
        while(temp!=0)
        {
            int fact=1;
            digit = temp%10;
            for(int i=1;i<=digit;i++)
            {
                fact=fact*i;
            }
            res+=fact;
            temp/=10;
        }
        if(res==num)
        {
            System.out.println(num+" is a strong number.");
        }
        else{
            System.out.println(num+" is not a strong number.");
        }
    }
}
