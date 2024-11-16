package threeClass;

public class OverLoadingPolymorphismExample {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();
        System.out.println(operations.add(10, 15));
        System.out.println(operations.add(100l, 150l));
        System.out.println(operations.add(10, 15, 30));
        System.out.println(operations.add(10.10, 15.15));
        System.out.println(operations.add(20.10f, 15.15f));
    }
}
