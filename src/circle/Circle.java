package circle;

public class Circle {
    private double radius; // Tạo thuộc tính radius có access modifier private
    private int id ;// Tạo thuộc tính id có access modifier private

    private static final double Pi = 3.14 ; //
    private static int count = 1 ;
    private static double maxRadius = 0 ;
    private static double sumArea = 0 ;
    private static Circle maxCircle = null ;

    public Circle(double radius) {
        this.radius = radius ;
        this.id = count++ ;
        if (maxRadius < radius) {
            maxRadius = radius;
        }
        sumArea += this.getArea() ;

    }
    public double getRadius() {
        return radius;
    }
    public int getId() {
        return id;
    }
    public double getArea() {
        return Pi * radius * radius;
    }
    public double getPerimeter () {
        return 2 * Pi * radius;
    }
    public void displayinfo () {
        System.out.println("ID = " + this.getId() ) ;
        System.out.println("Radius = " + this.getRadius() ) ;
        System.out.println("Area = " + this.getArea() ) ;
        System.out.println("Perimeter = " + this.getPerimeter() ) ;
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7.5);
        Circle circle3 = new Circle(10);

        circle1.displayinfo();
        circle2.displayinfo();
        circle3.displayinfo();

        System.out.println("Count = " + Circle.count);
        System.out.println("SumArea = " + Circle.sumArea);
        System.out.println("------------------------");
        Circle maxCircle = new Circle(maxRadius);
        System.out.println("Max circle.Circle : ");
        maxCircle.displayinfo();
    }


}