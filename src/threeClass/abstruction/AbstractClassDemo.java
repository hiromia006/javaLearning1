package threeClass.abstruction;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Circle cl = new Circle();
        cl.draw();
        cl.printShape();

        System.out.println("===============================");
        Shape sp = new Circle();
        sp.draw();
        sp.printShape();
    }
}
