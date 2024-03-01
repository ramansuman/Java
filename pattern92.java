/*pint:
 E D C B A
 E D C B
 E D C
 E D
 E
 */
import java.util.Scanner;
class pattern92
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            int ch='A'+n-1;
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print((char)ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}