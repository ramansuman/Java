/*print:
 5
 4 4
 3 3 3
 2 2 2 2
 1 1 1 1 1
*/
public class pattern50 {
    public static void main(String[] args) {
        int n=5;
        int x;
        for (int i = 1; i <=n; i++) {
            x=n-i+1;
            for (int j = 1; j <=n; j++) {
                if(j<=i){
                    System.out.print(x+" ");
                }
            }
            System.out.println();
        }
    }
}
