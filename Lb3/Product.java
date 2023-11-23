package Lb3;

public class Product {
    private int Id;
    private String Name;
    private double price;

    public Product(int Id, String Name, double price){
        this.Id = Id;
        this.Name = Name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }
}

