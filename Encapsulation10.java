/*Design a Restaurant class in Java with private attributes for restaurant
information, including`id`, `name`, `email`, `phone`, and `address`.Create a
appropriate constructor and implement encapsulation by providing appropriate
getters and setters for each attribute.
Create an object of Restaurant class and take the inputs from the user, verify the
mobile number starts with any of the following numbers 6, 7, 8 or 9, then set the
values and display the values using the setter and getters. */

import java.util.Scanner;

class Restaurant5 {
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
    public void setPhone(String phone) {
        this.phone = Long.parseLong(phone);
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
public class Encapsulation10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Restaurant5 restaurant = new Restaurant5();
        restaurant.setId(1);
        System.out.print("Enter the name of Restaurant : ");
        restaurant.setName(scan.nextLine());
        System.out.print("Enter the Email of Restaurant : ");
        restaurant.setEmail(scan.next());
        System.out.print("Enter the Phone number of Restaurant : ");
        String phone = scan.next();
        restaurant.setPhone(phone);
        while(phone.charAt(0)!='6'&&phone.charAt(0)!='7'
        &&phone.charAt(0)!='8'&&phone.charAt(0)!='9') {
            System.out.println("Please Enter a valid phone number!!!");
            System.out.print("Enter the Phone number of Restaurant : ");
            phone = scan.next();
            restaurant.setPhone(phone);
        }
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
