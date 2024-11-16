package threeClass;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person pn = new Person("Shantanu", 21);
        System.out.println(pn.getAge());
        System.out.println(pn.getName());

        System.out.println("\n Use Setter & Gather");
        Person pn1=new Person();
        pn1.setName("Ava");
        pn1.setAge(19);
        System.out.println(pn1.getName());
        System.out.println(pn1.getAge());
    }
}
