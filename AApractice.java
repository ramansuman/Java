import java.util.Scanner;

public class AApractice {
   public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    int a = scan.nextInt();
    if(a<0){
        a=a*-1;
    }
    System.out.println(a);
    scan.close();
    }
}