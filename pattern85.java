/*print:
 5 6 7 8 9
 4 5 6 7
 3 4 5
 2 3
 1
 */
import java.util.Scanner;
class pattern85
{
    public static void main(String arg[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            int x=n-i+1;
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}