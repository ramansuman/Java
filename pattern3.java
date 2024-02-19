/*print number square
 1 1 1 1 1
 2 2 2 2 2
 3 3 3 3 3
 4 4 4 4 4
 5 5 5 5 5
 */
public class pattern3 {
    public static void main(String[] args) {
        int i,j;
        int n= 5;
        for(i=1; i<=n; i++){
            for(j=1; j<=n; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
