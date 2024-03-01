/*print:
  5  9 12 14 15
  4  8 11 13
  3  7 10
  2  6
  1
 */
import java.util.Scanner;
class pattern88
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        scan.close();
        for(int i=1;i<=5;i++)
        {
            int x=n-i+1;
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(x+" ");
                x+=n-j;
            }
            System.out.println();
        }
    }
}