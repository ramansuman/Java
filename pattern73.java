/*print :
 A
 B B
 C C C 
 D D D D
 E E E E E
 */
import java.util.Scanner;
class pattern73
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        int ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)ch+" ");
            }
            System.out.println();
            ch++;
        }
        scan.close();
    }
}