/*print:-
        *
      * *
    * * *
  * * * *
* * * * *   
 */
import java.util.Scanner;
class pattern12{
    public static void main(String args[]){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}