public class ShapeTest {

    public static void main(String[] args){
        Shape s1 = new Rectangle(10,9);
        System.out.println(s1.calculatePerimeter());
        System.out.println(s1.calculateArea());

        Shape s2 = new Circle(5);
        System.out.println(s2.calculatePerimeter());
        System.out.println(s2.calculateArea());
    }
}
