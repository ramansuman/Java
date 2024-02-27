/*print:-
 01 10 11 20 21
 02 09 12 19 22
 03 08 13 18 23
 04 07 14 17 24
 05 06 15 16 25
*/
import java.util.Scanner;
class pattern27
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        int x,y;
        for(int i=1;i<=n;i++)
        {
            x=i;y=n-i+1;
            for(int j=1;j<=n;j++)
            {
                if(y<10)
                {
                    System.out.print("0");
                }
                if(j%2==0)
                    System.out.print(y+" ");
                else
                    System.out.print(x+" ");
                x=x+n;
                y=y+n;
            }
           
            System.out.println();
        }
        scan.close();
    }
}