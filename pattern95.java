//amit shah ke bare me kuch btayenge bhaiya
/*print :
 E F G H I
 D E F G 
 C D E
 B C
 A
 */
import java.util.Scanner;
class pattern95
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            int ch='A'+n-i;
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}