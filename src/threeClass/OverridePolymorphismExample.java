package threeClass;

public class OverridePolymorphismExample {
    public static void main(String[] args) {
        Vehicle vl = new Vehicle();
        vl.start();

        Bike bk = new Bike();
        bk.start();

        Car cr = new Car();
        cr.start();

        System.out.println("========================");
        Vehicle car1 = new Car();
        car1.start();
    }
}
