/*print:-
 01 06 11 16 21
 02 07 12 17 22
 03 08 13 18 23
 04 09 14 19 24
 05 10 15 20 25
 */
public class pattern26 {
    public static void main(String[] args) {
        int n=5;
        int k;
        for (int i = 1; i <=n; i++) {
            k=i;
            for (int j = 1; j <=n; j++) {
                if(k<10){
                    System.out.print("0");
                }
                System.out.print(k+" ");
                k=k+n;
            }
            System.out.println();
        }
    }
}
