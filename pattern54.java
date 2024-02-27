/*print:
 1
 3 2
 6 5 4
 10 9 8 7
 */
import java.util.Scanner;
class pattern54
{
    static public void main(String args[])
    {
        int n,count,x=0;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            count=i+x;
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count--;
            }
            x+=i;
            System.out.println();
        }
        scan.close();
    }
}
