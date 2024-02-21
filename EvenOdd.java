import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check wheather it is EVEN or ODD:- ");
        int a = scan.nextInt();
        if(a%2==0){
            System.out.println("Entered Number is even. ");
        }
        else{
            System.out.println("Entered Number is odd. ");
        }
        scan.close();
    }
}
