/*print:-
    *
   * * 
  *   *
 *     *  
* * * * * 
 */
public class pattern16 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for ( i = 0; i <=n; i++) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for ( j = 1; j <=i; j++) {
                if(i==1||j==i||i==n||j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}