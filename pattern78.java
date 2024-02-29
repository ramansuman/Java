/* print :
 E
 D D
 C C C 
 B B B B
 A A A A A
 */
import java.util.Scanner;
class pattern78
{
    static public void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        int ch= 'A'+n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)ch+" ");
            }
            ch--;
            System.out.println();
        }
    }
}