//Different ways to swap two numbers.
import java.util.Scanner;

public class swappinNumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number to swap them.");
        System.out.print("ENTER NUMBER 1 : ");
        num1= scan.nextInt();
        System.out.print("ENTER NUMBER 2 : ");
        num2=scan.nextInt();
        System.out.println("BEFORE SWAPPING : ");
        System.out.println("Number 1 : "+num1+" Number 2 : "+num2);
        //Method 1 : using temp variable
        /*int temp;
        temp=num1;
        num1=num2;
        num2=temp;*/


        //Method 2 : using arithmetic calculation
        /*num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;*/


        //Method 3 : using XOR 
        /*if(num1==num2){
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;
        }
        else{
            num1=num1^num2;
            num2=num1^num2;
            num1=num1^num2;
        }*/


        //Method 4 : using multiplication and division
        /*if(num1==0)
        {
            num1=num2;
            num2=0;
        }
        else if(num2==0)
        {
            num2=num1;
            num1=0;
        }
        else
        {
            num1=num1*num2;
            num2=num1/num2;
            num1=num1/num2;
        }*/


        //Method 5 : using arithmetic operation and updation in one line
        //num1 = num1 + num2 - (num2 = num1);

        //Method 6 : using Bitwise AND, Bitwise OR and Bitwise Complement Operator
        // same as num1 = num1 + num2
        num1 = (num1 & num2) + (num1 | num2);
        // same as num2 = num1 - num2
        num2 = num1 + (~num2) + 1;
        // same as num1 = num1 - num2
        num1 = num1 + (~num2) + 1;

        //Method 7 : Using Multiplication, Division and Updation in single Line.
        //num1 = (num1 * num2) / (num2 = num1);

        //Method 8 : Using Bitwise operator and updation in single line.
        //num1 = num1 ^ num2 ^ (num2 = num1);

        System.out.println("AFTER SWAPPING : ");
        System.out.println("Number 1 : "+num1+" Number 2 : "+num2);
        scan.close();
    }
}
