/*Design a Restaurant class in Java with private attributes for Restaurant
information, including`id`, `name`, `email`, `phone`, and `address`.Create a
appropriate constructor and implement encapsulation by providing appropriate
getters and setters for each attribute.
Create an object of Restaurant class and take the inputs from the user, verify the
email whether it contains the domain name as the name of the restaurant then set
the values and display the values using the setter and getters. */

import java.util.Scanner;

class Restaurant4 {
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
public class Encapsulation9 {
    public static void main(String[] args) {
        Restaurant4 restaurant = new Restaurant4();
        restaurant.setId(1);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of Restaurant : ");
        restaurant.setName(scan.nextLine());
        StringBuilder name = new StringBuilder();
        for(int i=0;i<restaurant.getName().length();i++) {
            char ch=restaurant.getName().toLowerCase().charAt(i);
            if(ch!=' '){
                name.append(ch);
            }
        }
        System.out.print("Enter the Email of Restaurant : ");
        restaurant.setEmail(scan.next());
        StringBuilder email = new StringBuilder();
        for(int i=restaurant.getEmail().indexOf("@")+1;restaurant.getEmail().charAt(i)!='.';i++) {
            email.append(restaurant.getEmail().charAt(i));
        }
        while (!email.toString().equals(name.toString())) {
            System.out.println("Please Enter the email same as restaurant name. !!!");
            System.out.print("Enter the Email of Restaurant : ");
            restaurant.setEmail(scan.next());
            email.setLength(0);
            for(int i=restaurant.getEmail().indexOf("@")+1;restaurant.getEmail().charAt(i)!='.';i++) {
                email.append(restaurant.getEmail().charAt(i));
            }
        }
        System.out.print("Enter the Phone number of Restaurant : ");
        restaurant.setPhone(scan.nextLong());
        scan.nextLine();
        System.out.print("Enter the Address of Restaurant : ");
        restaurant.setAddress(scan.nextLine());
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();
        System.out.println("The Id of Restaurant is : "+restaurant.getId());
        System.out.println("The Name of Restaurant is : "+restaurant.getName());
        System.out.println("The Email of Restaurant is : "+restaurant.getEmail());
        System.out.println("The Phone number of Restaurant is : "+restaurant.getPhone());
        System.out.println("The Address of Restaurant is : "+restaurant.getAddress());
        scan.close();
    }
}
