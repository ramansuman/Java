/*, The professor decides to cancel class if fewer than some number of students are present when
class starts. Arrival times go from on time (arrivalTime<=0) to arrived late (arrivalTime>0).Given the arrival time of each
student and a threshhold number of attendees, determine if the class is cancelled. 
Input:
n= Total number of students.
k= Threshold number of attendees
a= Arrival time of all the students
*/

import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the total number of students : ");
        int n= scan.nextInt();
        int[] arr =  new int[n];
        System.out.print("Please Enter the threshold number of attendees (0 - "+n+") : ");
        int k=scan.nextInt();
        while(k<0||k>n)
        {
            if(k<0)
            {
                System.out.println("Threshold number of attendees can never be negative.");
            }
            else if(k>n)
            {
                System.out.println("Enter the Threshold number of attendees lesser or equals to the number of Students.");
            }
            System.out.print("Please enter the threshold number of attendees again : ");
            k=scan.nextInt();
        }
        System.out.println("Enter the arrival time of all "+n+" students : ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=scan.nextInt();
        }
        scan.close();
        classCancel(arr,k);
    }
    static void classCancel(int[] arr, int k)
    {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=0)
                count++;
        }
        if(count>=k)
            System.out.print("NO");
        else
            System.out.print("YES");
    }
}
