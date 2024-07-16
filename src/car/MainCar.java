package car;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("Audi", "Red" ,2000) ;
        Car car2 = new Car("BMW", "Blue" ,3000) ;
        Car car3 = new Car("Honda", "While" ,1000) ;

        car.displayinfo();
        car2.displayinfo();
        car3.displayinfo();

        System.out.println("Number Of Car : " + (Car.numberOfCars));
    }
}
