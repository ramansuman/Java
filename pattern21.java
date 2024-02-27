/*print:-
 5 5 5 5 5
 4 4 4 4 4
 3 3 3 3 3
 2 2 2 2 2
 1 1 1 1 1
 */
import java.util.Scanner;
class pattern21
{
    public static void main(String args[])
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern :");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1; j<=n;j++)
            {
                System.out.print(n-i+1+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
