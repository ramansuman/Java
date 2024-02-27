/*print:
 * * * * *
 * * * *
 * * *
 * *
 * 
 
 */
import java.util.Scanner;
class pattern55{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
