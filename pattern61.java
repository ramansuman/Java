/*print : 
  1
  6  2
 10  7  3
 13 11  8  4
 15 14 12  9  5
 */
import java.util.Scanner;
class pattern61
{
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        int x,y=1;
        for(int i=1;i<=n;i++)
        {
            x=y;
            for(int j=1;j<=i;j++)
            {
                if(x<10)
                    System.out.print(" ");
                System.out.print(x+" ");
                x=x-(n-i+j);
            }
            y=y+n-i+1;
            System.out.println();
        }
        scan.close();
    }
}