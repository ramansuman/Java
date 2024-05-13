/*Design a Restaurant class in Java with private attributes for restaurant
information, including`id`, `name`, `email`, `phone`, and `address`.Create an
appropriate constructor and implement encapsulation by providing appropriate
setters and getters for each attribute.
Create an object of Restaurant & take the inputs from the user, set the values using
constructor display the values using getters.
Sample Input:
Donne Biryani , donnebiryani@gmail.com , 6677889955 , Btm layout Bengaluru
Sample Output:
1
Donne Biryani
donnebiryani@gmail.com
6677889955
Btm layout, Bengaluru */

import java.util.Scanner;

class Restaurant3 {
    private int id;
    private String name;
    private String email;
    private long phone;
    private String address;

    Restaurant3(int id, String name, String email, String phone, String address) {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=Long.parseLong(phone);
        this.address=address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
}
public class Encapsulation8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input for restaurant in one line(comma seperated) : ");
        String str=scan.nextLine();
        String arr[] = str.split(",");
        Restaurant3 restaurant = new Restaurant3(1, arr[0], arr[1], arr[2], arr[3]);
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
