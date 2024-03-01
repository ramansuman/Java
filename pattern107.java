/*print :
              5
           9  4
       12  8  3
    14 11  7  2
 15 13 10  6  1
 */
import java.util.Scanner;
class pattern107
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        int x=n;
        int y;
        for(int i=1;i<=n;i++)
        {
            y=x;
            for (int k = 1; k <=n-i; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=i; j++) {
                if(y<10)
                    System.out.print(" ");
                System.out.print(y+" ");
                y=y-(n-i+j+1);
            }
            System.out.println();
            x=x+n-i;
        }
    }
}