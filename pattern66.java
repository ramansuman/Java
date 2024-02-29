/* print: 
 1
 4 9
 16 25 36
 49 64 81 100
 121 144 169 196 225
 */
import java.util.Scanner;
public record pattern66() {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=1;
        System.out.print("Eter the size of the pattern  :");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count*count+" ");
                count++;
            }
            System.out.println();
        }
        scan.close();
    }
}
