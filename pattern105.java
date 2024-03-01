/*print :
              1
           6  2
       10  7  3
    13 11  8  4
 15 14 12  9  5
 */
import java.util.Scanner;
class pattern105
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        scan.close();
        int x=1;
        int y;
        for (int i = 1; i <=n; i++) {
            y=x;
            for (int k = 1; k <=n-i; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=i; j++) 
            {
                if(y<10)
                    System.out.print(" ");
                System.out.print(y+" ");
                y=y-(n-i+j);
            }
            System.out.println();
            x=x+n-i+1;
        }
    }
}