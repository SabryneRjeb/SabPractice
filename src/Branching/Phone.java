package Branching;

public class Phone {
    public String name,brand,color;
    public int year;
    public double price;


    static{
      boolean HasBattery,HasButtons;

    }

    public Phone(String name, String brand, String color, int year, double price) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
