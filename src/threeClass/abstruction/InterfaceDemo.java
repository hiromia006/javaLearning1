package threeClass.abstruction;

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable doc = new Document();  // Using interface reference for Document
        Printable img = new Image();     // Using interface reference for Image

        doc.print(); // Calls Document's print method
        img.print(); // Calls Image's print method

        Document docu=new Document();
        docu.print();
    }

}
