package shapes;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(10, 10, 10);
        t.printPerimetr();
        Circle c = new Circle(15);
        c.printPerimetr();
        Square s = new Square(5);
        s.printPerimetr();
        Rectangle r  = new Rectangle(20, 40);
        r.printPerimetr();

    }
}

