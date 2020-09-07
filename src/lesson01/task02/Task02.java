package lesson01.task02;

public class Task02 {
    public static void main(String[] args) {
        Triangle t = new Triangle(1, 3, 10, 10, 10);
        t.printPerimetr();
        Circle c = new Circle(2, 4, 15);
        c.printPerimetr();
        Square s = new Square(3, 5);
        s.printPerimetr();
        Rectangle r  = new Rectangle(4, 6, 20, 40);
        System.out.println(" X = " + r.x + " Y = " + r.y + " Width = " + r.width + " Height = " + r.height);

    }
}
    abstract class Shape{
        float x;
        float y;

        Shape(float x, float y){
            this.x = x;
            this.y = y;
        }
        public abstract float getPerimeter();
        public void printPerimetr(){
            System.out.println("Perimetr = " + getPerimeter());
        }
    }

    class Triangle extends Shape{
        private float a;
        private float b;
        private float c;

        Triangle(float x, float y, float a, float b, float c){
            super(x, y);
            this.a = a;
            this.b = b;
            this.c = c;
        }
        @Override
        public float getPerimeter(){
            return a + b + c;
        }
    }
    class Circle extends Shape{
        private float r;

        Circle(float x, float y, float r) {
            super(x, y);
            this.r = r;
        }

        @Override
        public float getPerimeter() {
            return 2 * (float)3.14 * r;
        }
    }
    class Square extends Shape{
        private float width;
        private float height;

        Square(float x, float y, float side) {
            super(x, y);
            this.width = side;
            this.height = side;
        }

        public Square(float x, float y) {
            super(x, y);
        }

        @Override
        public float getPerimeter() {
            return width * 2 + height * 2;
        }
    }
    class Rectangle extends Square{
        public float width;
        public float height;

        Rectangle(float x, float y, float width, float height) {
            super(x, y);
            this.width = width;
            this.height = height;
        }
    }

