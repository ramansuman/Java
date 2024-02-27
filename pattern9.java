/*print:-
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern :");
        n=scan.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1; j<=n;j++){
                if(j<=i){
                    if((i+j)%2==0){
                        System.out.print("1 ");
                    }
                    else
                        System.out.print("0 ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}