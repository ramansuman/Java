/*print:-
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scan.close();
    }   
}
