/*print:
 A F K P U
 B G L Q V
 C H M R W
 D I N S X
 E J O T Y
 */
public class pattern46 {
    public static void main(String[] args) {
        int n=5;
        int x;
        for (int i = 1; i <=n; i++) {
            x=65+i-1;
            for (int j = 1; j <=n; j++) {
                System.out.print((char)x+" ");
                x=x+n;
            }
            System.out.println();
        }
    }
}
