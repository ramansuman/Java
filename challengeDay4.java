/*Question:
Write a program that takes two integers, n1 and n2, as input and prints the common factors of n1 and n2.

Example:
Input: n1 = 12, n2 = 18
Output: 1, 2, 3, 6
*/
import java.util.Scanner;
public interface challengeDay4 {
    static void printFactor(int number1, int number2)
    {
        if(number1<number2)
        {
            for (int i = 1; i < number1; i++)
            {
                if(number1%i == 0 && number2%i == 0)
                    System.out.print(i+" ");
            }
        }
        else
        {
            for (int i = 1; i < number2; i++)
            {
                if(number1%i == 0 && number2%i == 0)
                    System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        System.out.println("ENTER TWO NUMBER TO FIND COMMON FACTOR ");
        System.out.print("Enter first number : ");
        num1=scan.nextInt();
        System.out.print("Enter second number : ");
        num2=scan.nextInt();
        System.out.println("COMMON FACTOR OF "+num1 +" AND "+num2+ " IS :");
        printFactor(num1,num2);
        scan.close();
    }
}
