/*print:
 E J O T Y
 D I N S X
 C H M R W
 B G L Q V
 A F K P U
 */
import java.util.Scanner;
class pattern47
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int ch= 65+n-i;
            for(int j=1;j<=n;j++)
            {
                System.out.print((char)ch+" ");
                ch+=n;
            }
            System.out.println();
        }
        scan.close();
    }
}