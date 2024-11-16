package threeClass;

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Cat ct = new Cat();
        ct.meow();
        ct.eat();

        System.out.println("\nSecond subclass....");
        Dog dg = new Dog();
        dg.bark();
        dg.eat();
    }
}
