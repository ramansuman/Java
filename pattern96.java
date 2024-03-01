/*print :
A
B C
D E F
G H I J
K L M N O
 */
import java.util.Scanner;
class pattern96
{
    static public void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        int ch='A';
        scan.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}