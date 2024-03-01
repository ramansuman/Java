/*print:
             1
          2  4
       3  6  9
    4  8 12 16
 5 10 15 20 25
 */
import java.util.Scanner;
class pattern101
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            int x=i;
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++)
            {
                if(x<10)
                    System.out.print(" ");
                System.out.print(x+" ");
                x+=i;
            }
            System.out.println();
        }
    }
}