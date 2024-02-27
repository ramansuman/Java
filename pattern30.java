/*print:-
 1 2 3 4 5
 2 3 4 5 6
 3 4 5 6 7
 4 5 6 7 8
 5 6 7 8 9
 */
import java.util.Scanner;
public class pattern30
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern :");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=i;
            for(int j=1;j<=n;j++)
            {
                if(x<10)
                    System.out.print("0");
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        scan.close();
    }
}
