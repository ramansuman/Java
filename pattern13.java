/*print:-
    *
   * *
  * * *
 * * * *
* * * * *   
 */
import java.util.Scanner;
class pattern13
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of Pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k =1; k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}