/*print:-
  1  3  5  7  9
  3  5  7  9 11
  5  7  9 11 13
  7  9 11 13 15
  9 11 13 15 17
 */
import java.util.Scanner;
class pattern31{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern :");
        n=scan.nextInt();
        for(int i=1;i<=n*2;i+=2)
        {
            int x=i;
            for(int j=1;j<=n;j++)
            {
                if(x<10)
                    System.out.print("0");
                System.out.print(x+" ");
                x+=2;
            }
            System.out.println();
        }
        scan.close();
    }
}
