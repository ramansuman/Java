/*print:-
 05 10 15 20 25
 04 09 14 19 24
 03 08 13 18 23
 02 07 12 17 22
 01 06 11 16 21
 */
import java.util.Scanner;
public class pattern28{
    static public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=n-i+1;
            for(int j=1;j<=n;j++)
            {
                if(x<10)
                    System.out.print("0");
                System.out.print(x+" ");
                x+=n;
            }
            System.out.println();
        }
        scan.close();
    }
}
