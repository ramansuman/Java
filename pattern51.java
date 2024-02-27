/*print:
 5
 5 4
 5 4 3
 5 4 3 2
 5 4 3 2 1
 */
import java.util.Scanner;
class pattern51
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern :");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int x=n-j+1;
                System.out.print(x+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
