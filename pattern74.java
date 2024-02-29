/*print :
 A
 A B
 A B C
 A B C D
 A B C D E
 */
import java.util.Scanner;
class pattern74
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern :");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
        scan.close();
    }
}