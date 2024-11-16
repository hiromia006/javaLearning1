package firstclass;

public class Operators {
    public static void main(String[] args) {
        //Assignment Operator
        int mark = 70;
        mark += 60; // mark=mark+60; mark=70+60=130;
        System.out.println(mark);

        mark -= 100;// 130-100=30;
        System.out.println(mark);

        mark *= 10;
        System.out.println(mark);

        //Relational Operator
        System.out.println("Relational Operator");
        System.out.println(16 > 50);
        System.out.println(16 >= 50);
        System.out.println(16 < 50);
        System.out.println(16 <= 50);
        System.out.println(16 == 50);
        System.out.println(16 != 50);


        System.out.println("Logical Operator");
        System.out.println(16 > 50 && 16 < 50);
        System.out.println((16 >= 50 || 16 < 50) && (16 > 50 && 16 < 50));
        System.out.println((16 >= 50 || 16 < 50) || (16 > 50 && 16 < 50));
        //(false || true)=true
        // &&
        // (false && 16<50)=false

        System.out.println("Unary Operator");
        int number = 30;
        //++, --; pre ++/-- Post ++/--
        // ++, number=number+1; -- number=number-1;
        System.out.println(++number); // 31
        System.out.println(number); //31
        System.out.println(number++); //31, // 31+1=32
        System.out.println(number--); //32, // 32-1=31
        System.out.println(--number); //31-1=30
        System.out.println(number); // 30


    }
}
