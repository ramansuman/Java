/*Design a Restaurant class in Java with private attributes for restaurant
information, including`id`, `name`, `email`, `phone` and `address`. Implement
encapsulation by providing appropriate getters and setters for each attribute.
Create an object of Restaurant class and take the user inputs and set the values and
display the values using setters and getters. */

import java.util.Scanner;

class Restaurant1 {
    private int id;
    private String name;
    private String email;
    private long phone;
    private String address;
    public void setId(int id) {
        this.id=id;
    }
    public int getId() {
        return this.id;
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
public class Encapsulation6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Restaurant1 restaurant = new Restaurant1();
        System.out.print("Enter the id of Restaurant : ");
        restaurant.setId(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter the name of Restaurant : ");
        restaurant.setName(scan.nextLine());
        System.out.print("Enter the Email of Restaurant : ");
        restaurant.setEmail(scan.next());
        System.out.print("Enter the Phone number of Restaurant : ");
        restaurant.setPhone(scan.nextLong());
        scan.nextLine();
        System.out.print("Enter the Address of Restaurant : ");
        restaurant.setAddress(scan.nextLine());
        System.out.println("-------------------------------------------------------");
        System.out.println("The Id of Restaurant is : "+restaurant.getId());
        System.out.println("The Name of Restaurant is : "+restaurant.getName());
        System.out.println("The Email of Restaurant is : "+restaurant.getEmail());
        System.out.println("The Phone number of Restaurant is : "+restaurant.getPhone());
        System.out.println("The Address of Restaurant is : "+restaurant.getAddress());
        scan.close();
    }
}
