/*Design a Menu class in Java with private attributes for menu information,
including `id`, `name`, `price`, and `description`. Implement encapsulation by
providing appropriate getters and setters for each attribute.
Create multiple objects of Menu according to the user & take the inputs from the
user, set the values & display the values using setter and getters. */

import java.util.Scanner;

class Menu2 {
    private int id;
    private String name;
    private int price;
    private String description;
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
public class Encapsulation12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Objects to be created : ");
        int n = scan.nextInt();
        scan.nextLine();
        Menu2[] arr = new Menu2[n];
        for(int i = 1;i<=arr.length;i++) {
            Menu2 menu = new Menu2();
            menu.setId(i);
            System.out.print("Enter the Name of Dish "+i+" in Menu : ");
            menu.setName(scan.nextLine());
            System.out.print("Enter the Price of Dish "+i+" in Menu : ");
            menu.setPrice(scan.nextInt());
            scan.nextLine();
            System.out.print("Enter the Description of Dish "+i+" in Menu : ");
            menu.setDescription(scan.nextLine());
            arr[i-1]=menu;
            System.out.println();
        }
        scan.close();
        System.out.println("----------------------------------------------");
        for (int i = 1; i <=arr.length; i++) {
            Menu2 menu = arr[i-1];
            System.out.println("The Id of Dish "+i+" in Menu is : "+menu.getId());
            System.out.println("The Name of Dish "+i+" in Menu is : "+menu.getName());
            System.out.println("The Price of Dish "+i+" in Menu is : "+menu.getPrice());
            System.out.println("The Description of Dish "+i+" in Menu is : "+menu.getDescription());
            System.out.println();
        }
    }
}
