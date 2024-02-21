/*print:
 5
 5 4
 5 4 3
 5 4 3 2
 5 4 3 2 1
 */
public class pattern51 {
    public static void main(String[] args) {
        int n=5;
        int x;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j<=i){
                    x=n-j+1;
                    System.out.print(x+" ");
                }
            }
            System.out.println();
        }
    }
}
