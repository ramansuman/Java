/*print:
 A F K P U
 B G L Q V
 C H M R W
 D I N S X
 E J O T Y
 */
import java.util.Scanner;
class pattern46
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int ch = i+65-1;
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