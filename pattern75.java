/*print :
 E
 E D
 E D C
 E D C B
 E D C B A
 */
import java.util.Scanner;
class pattern75
{
    static public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int ch='A'+n-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)ch+" ");
                ch--;
            }
            System.out.println();
        }
        scan.close();
    }
}