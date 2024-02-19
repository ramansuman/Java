/*print:-
  1  3  5  7  9
  3  5  7  9 11
  5  7  9 11 13
  7  9 11 13 15
  9 11 13 15 17
 */
public class pattern31 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=2*n; i=i+2) {
            for (int j = 1; j <=2*n; j+=2) {
                if((i+j-1)<10){
                    System.out.print(" ");
                }
                System.out.print((i+j-1)+" ");
            }
            System.out.println();
        }
    }
}
