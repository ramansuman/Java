/*print :
         1
       2 1
     3 2 1
   4 3 2 1
 5 4 3 2 1
 */
import java.util.Scanner;
class pattern100
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            int x=i;
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                x--;
            }
            System.out.println();
        }
    }
}