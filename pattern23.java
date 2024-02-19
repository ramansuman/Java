/*print:-
 02 04 06 08 10
 12 14 16 18 20
 22 24 26 28 30
 32 34 36 38 40
 42 44 46 48 50
 */
public class pattern23 {
    public static void main(String[] args) {
        int count=2;
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(count<10){
                    System.out.print("0");
                }
                System.out.print(count+" ");
                count=count+2;
            }
            System.out.println();
        }
    }
}
