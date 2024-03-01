/*print :
 5 4 3 2 1
 5 4 3 2 
 5 4 3 
 5 4 
 5 
 */
import java.util.Scanner;
class pattern83
{
    static public void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
}