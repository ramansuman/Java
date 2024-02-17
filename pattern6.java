/*print
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 */
public class pattern6 {
    public static void main(String[] args) {
        int i,j;
        int n= 5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }
    }    
}
