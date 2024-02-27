/*PRINT:
 5
 4 5
 3 4 5
 2 3 4 5
 1 2 3 4 5
 */
import java.util.Scanner;
class pattern52
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern :");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=n-i+1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        scan.close();
    }
}
