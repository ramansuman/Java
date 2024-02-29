/*print: fibonacci puramid
 0
 0 1
 0 1 1
 0 1 1 2 
 0 1 1 2 3
 */
import java.util.Scanner;
class patter69
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of patten : ");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a=0;
            int b=1;
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                    System.out.print(a+" ");
                else
                {
                    a=a+b;
                    b=a-b;
                    System.out.print(a+" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}