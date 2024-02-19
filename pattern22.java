/*print:-
 01 03 05 07 09
 11 13 15 17 19
 21 23 25 27 29
 31 33 35 37 39
 41 43 45 47 49 
 */
public class pattern22 {
    public static void main(String[] args) {
        int count= 1;
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(count<10){
                    System.out.print("0");
                }
                System.out.print(count+" ");
                count= count+2;
            }
            System.out.println();
        }
    }
}
