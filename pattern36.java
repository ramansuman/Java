/*print:-
 0 0 0 0 0
 1 1 1 1 1
 0 0 0 0 0 
 1 1 1 1 1 
 0 0 0 0 0
 */
public class pattern36 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i%2==1){
                    System.out.print("0 ");
                }
                else{
                    System.err.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
