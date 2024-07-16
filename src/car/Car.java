package car;

public class Car {
    private String name ;
    private String color;
    private int price;
    static int numberOfCars = 0;
    public Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
        numberOfCars++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("--------------");
    }

}
