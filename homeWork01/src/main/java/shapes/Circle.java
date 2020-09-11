package shapes;

class Circle extends Shape{
    private float r;

    Circle(float r) {
        name = "Circle";
        this.r = r;
    }

    @Override
    public float getPerimeter() {
        return 2 * (float)3.14 * r;
    }
}
