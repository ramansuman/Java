/*print:-
*
* *
* * *
* * * *
* * * * *
*/
import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i =1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i)
                    System.out.print("* ");
            }
            System.out.println();
            scan.close();
        }
    }
}
