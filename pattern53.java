/*print:
 1
 2 3
 3 4 5
 4 5 6 7
 5 6 7 8 9
 */
public class pattern53 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            int x=i;
            for (int j = 1; j <=n; j++) {
                if(j<=i)
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
    }
}
