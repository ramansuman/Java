import java.util.Scanner;
class AApractice{
    public static void main(String args[]){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        int count =0;
        for(int i=n;i>=0;i=i/10){
        count++;
        }
        System.out.println(count);
        scan.close();
    }
}