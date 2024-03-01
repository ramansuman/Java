/*print:
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2 
 1
 */
import java.util.Scanner;
class pattern81
{
    static public void main(String []args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
