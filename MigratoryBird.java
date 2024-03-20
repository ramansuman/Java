/*Given an array of bird sightings where every element represents a bird type id, determine the id of 
the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the 
smallest of their ids. */
import java.util.Scanner;

public class MigratoryBird {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of birds sighted : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the id of birds sighted : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
            while(arr[i]<1||arr[i]>5)
            {
                System.out.println("Bird Id can only between 1 to 5!!!");
                System.out.print("Enter the bird id again : ");
                arr[i]=scan.nextInt();
            }
        }
        scan.close();
        mostSightedBird(arr);
    }
    static void mostSightedBird(int[] arr)
    {
        int[] idArr = new int[5];
        for (int i = 0; i < arr.length; i++) 
        {
            idArr[arr[i]-1]++;
        }
        /*[4,1,0,0,0] */
        int max=-1,maxId=0;
        for (int i = 0; i < idArr.length; i++) {
            if(idArr[i]>max)
            {
                max=idArr[i];
                maxId=i;
            }
        }
        System.out.println("Maximum sighted bird with lowest id is : "+ ++maxId);
    }
}
