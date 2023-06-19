package thuchanh3;

public class Main {
    public static void main(String[] args) {
        // kiểm thử class Shape
        System.out.println("----======-----");
        Shape shape = new Shape();
        System.out.println(shape);


       shape = new Shape("red", false);
        System.out.println(shape);

        // kiem thu class Circle
        System.out.println("----=====------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5,"yellow",false);
        System.out.println(circle);

        // kiem thu rectangle
        System.out.println("======---=====");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange", true, 5.0, 4.6);
        System.out.println(rectangle);


    }


}
