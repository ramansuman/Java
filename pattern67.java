/*print:
  1
  2 6 
  3 7 10
  4 8 11 13
  5 9 12 14 15
 */
import java.util.Scanner;
public class pattern67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=i;
            for(int j=1;j<=i;j++)
            {
                if(x<10)
                    System.out.print(" ");
                System.out.print(x+" ");
                x+=n-j;
            }
            System.out.println();
        }
        scan.close();
    }       
}

