/*print:
E D C B A
E D C B A
E D C B A
E D C B A
E D C B A
*/
import java.util.Scanner;
class pattern43
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern :");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=65+n-1;j>=65;j--)
            {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}