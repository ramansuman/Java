/*print
 1
 0 0
 1 1 1
 0 0 0 0
 1 1 1 1 1
 */
import java.util.Scanner;
class pattern70
{
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        for(int i=1; i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2==0)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }
            System.out.println();
        }
        scan.close();
    }
}