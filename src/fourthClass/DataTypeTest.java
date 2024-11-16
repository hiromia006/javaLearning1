package fourthClass;


import java.util.Arrays;
import java.util.List;

public class DataTypeTest {
    public static void main(String[] args) {

        //Non generic
        StringTest test = new StringTest("Nova");
        System.out.println(test.getString());

        IntegerTest test1 = new IntegerTest(100);
        System.out.println(test1.getInteger());

        DoubleTest test2 = new DoubleTest(12345.67);
        System.out.println(test2.getaDouble());

        LongTest test3 = new LongTest(98765l);
        System.out.println(test3.getaLong());

        System.out.println("================================");
        //Generic without restriction
        Generic<String> generic1 = new Generic<>("Nova");
        System.out.println(generic1.getContent());

        Generic<Integer> generic2 = new Generic<>(100);
        System.out.println(generic2.getContent());

        Generic<Double> generic3 = new Generic<>(12345.67);
        System.out.println(generic3.getContent());

        Generic<Long> generic4 = new Generic<>(98765l);
        System.out.println(generic4.getContent());


        //Generic with restriction
        genericWithWildCard<Integer> generic5=new genericWithWildCard<>(1000);
        System.out.println(generic5.getContent());

    }
}
