/*print : fibonacci series
 1
 1 2
 3 5 8
 13 21 34 55
 89 144 233 377 610
 */
import java.util.Scanner;
class pattern68
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        int a=1,b=1;
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==1&&j==1)
                    System.out.print(a+" ");
                else
                {
                System.out.print(b+" ");
                b=a+b;
                a=b-a;
                }
            }
            System.out.println();
        }
        scan.close();
    }
}