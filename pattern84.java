/*print:
 5 4 3 2 1
 6 5 4 3
 7 6 5
 8 7
 9
 */
import java.util.Scanner;
class pattern84
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            int x=n+i-1;
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(x+" ");
                x--;
            }
            System.out.println();
        }
    }
}