/*armstrong: if sum of the power of digit by number of digit is equals to the original digit.
 153 is armstrong number. number of digit in 153 is 3. 1^3+5^3+3^3=1+125+27=153.
 */

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter a number to check if it is armstrong number or not : ");
        num =scan.nextInt();
        int count=0,temp=num;
        while(temp!=0){
            temp/=10;
            count++;
        }
        int sum=0,digit;
        temp=num;
        while(temp!=0){
            digit=temp%10;
            sum+=Math.pow(digit,count);
            temp/=10;
        }
        if(sum==num)
            System.out.print(num+" is a armstrong number.");
        else
            System.out.println(num+" is not a armstrong number.");
        scan.close();
    }
}
