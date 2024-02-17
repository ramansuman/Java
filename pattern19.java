/*print:-
         1
       2 1 2
     3 2 1 2 3
   4 3 2 1 2 3 4
 5 4 3 2 1 2 3 4 5
 */
public class pattern19 {
    public static void main(String[] args) {
        int i,j,k,l;
        int n=5;
        for ( i = 1; i <=n; i++) {
            for ( k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for ( j = 1; j <= 1; j++) {
                for(l=i;l>=1;l--){
                    System.out.print(l+ " ");
                }
                for(l=2;l<=i;l++){
                    System.out.print(l+ " ");
                }
            }
            System.out.println();
        }
    }
}
