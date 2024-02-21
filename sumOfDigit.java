import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter a number to find the sum of all of its digit : ");
        num=scan.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Sum of all digits in "+num+" is : "+sum);
        scan.close();
    }
}
