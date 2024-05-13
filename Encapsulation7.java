/*Design a Restaurant class in Java with private attributes for restaurant
information, including `id`, `name`, `email`, `phone`, and `address`. Implement
encapsulation by providing appropriate getters and setters for each attribute.
Create multiple objects of the Restaurant according to the user & take the inputs
from the user, set the values & display the values using setter and getters.
 */

import java.util.Scanner;

class Restaurant2{
    private int id;
    private String name;
    private String email;
    private long phone;
    private String address;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
 }
public class Encapsulation7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Objects needed : ");
        int n = scan.nextInt();
        scan.nextLine();
        Restaurant2[] arr =  new Restaurant2[n];
        for(int i=0;i<arr.length;i++) {
            Restaurant2 restaurant = new Restaurant2();
            restaurant.setId(i+1);
            System.out.print("Enter the Name of restaurant "+(i+1)+" : ");
            restaurant.setName(scan.nextLine());
            System.out.print("Enter the Email of restaurant "+(i+1)+" : ");
            restaurant.setEmail(scan.next());
            System.out.print("Enter the phone number of restaurant "+(i+1)+" : ");
            restaurant.setPhone(scan.nextLong());
            scan.nextLine();
            System.out.print("Enter the Address of restaurant "+(i+1)+": ");
            restaurant.setAddress(scan.nextLine());
            arr[i]=restaurant;
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();
        for(Restaurant2 restaurant : arr) {
            System.out.println("The Id of restaurant "+restaurant.getId()+" is : "+restaurant.getId());
            System.out.println("The Name of restaurant "+restaurant.getId()+" is : "+restaurant.getName());
            System.out.println("The Email of restaurant "+restaurant.getId()+" is : "+restaurant.getEmail());
            System.out.println("The Phone number of restaurant "+restaurant.getId()+" is : "+restaurant.getPhone());
            System.out.println("The Address of restaurant "+restaurant.getId()+" is : "+restaurant.getAddress());
            System.out.println();
        }
        scan.close();
    }
}
