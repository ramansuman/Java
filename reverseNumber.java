import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number to reverse : ");
        number=scanner.nextInt();
        int count=0;
        int tempnum=number;
        while(tempnum!=0){
            tempnum/=10;
            count++;
        }
        int digit;
        int reverse=0;
        tempnum=number;
        for (int i = count; i >=1; i--) {
            digit=tempnum%10;
            reverse += digit*(Math.pow(10,i-1));
            tempnum/=10;
        }
        System.out.println("Reversed number is : "+reverse);
        scanner.close();
    }
}
