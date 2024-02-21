/*PRINT:
 5
 4 5
 3 4 5
 2 3 4 5
 1 2 3 4 5
 */
public class pattern52 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j<=i)
                System.out.print(n-i+j+" ");
            }
            System.out.println();
        }
    }
}
