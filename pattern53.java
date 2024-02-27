/*print:
 1
 2 3
 3 4 5
 4 5 6 7
 5 6 7 8 9
 */
import java.util.Scanner;
class pattern53
{
    static public void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=i;
            for(int j=1; j<=i;j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        scan.close();
    }
}