/*print :
 E E E E E
 D D D D
 C C C 
 B B 
 A
 */
import java.util.Scanner;
class pattern91
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        int ch='A'+n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print((char)ch+" ");
            }
            System.out.println();
            ch--;
        }
    }
}