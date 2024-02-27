/*print:
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 */
import java.util.Scanner;
class pattern48
{
    public static void main(String args[])
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}