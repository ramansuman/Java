/*print:
 E E E E E
 D D D D D
 C C C C C
 B B B B B
 A A A A A
 */
import java.util.Scanner;
class pattern42
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int ch=65+n-i;
                System.out.print((char)ch+" ");
                ch--;
            }
            System.out.println();
        }
        scan.close();
    }
}
