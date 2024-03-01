/*print :
 E D C B A 
 F E D C
 G F E
 H G
 I
 */
import java.util.Scanner;
class pattern94
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            int ch='A'+n+i-2;
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print((char)ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}