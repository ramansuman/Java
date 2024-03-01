/*print :
 5 5 5 5 5
 4 4 4 4
 3 3 3 
 2 2 
 1
 */
import java.util.Scanner;
class pattern82
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(n-i+1+" ");
            }
            System.out.println();
        }
    }
}