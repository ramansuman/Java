/*print :
 1 1 1 1 1
 2 2 2 2
 3 3 3 
 4 4
 5
 */
import java.util.Scanner;
class patter80
{
    static public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}