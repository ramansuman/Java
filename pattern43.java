/*print:
E D C B A
E D C B A
E D C B A
E D C B A
E D C B A
*/
public class pattern43 {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i <=n; i++) {
            for (int j = 65+n-1; j >=65; j--) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
