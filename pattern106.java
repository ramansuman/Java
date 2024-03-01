/*print :
              1
           3  2
        6  5  4
    10  9  8  7
 15 14 13 12 11
 */
import java.util.Scanner;
class pattern106
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        scan.close();
        int x=1;
        int y;
        for(int i=1;i<=n;i++)
        {
            y=x;
            for (int k = 1; k <=n-i; k++) {
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++)
            {
                if(y<10)
                    System.out.print(" ");
                System.out.print(y+" ");
                y--;
            }
            System.out.println();
            x=x+i+1;
        }
    }
}