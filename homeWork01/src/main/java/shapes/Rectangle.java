package shapes;

class Rectangle extends Shape{
    public float width;
    public float height;

    Rectangle(float width, float height) {
        name = "Rectangle";
        this.width = width;
        this.height = height;
    }
    @Override
    public float getPerimeter() {
        return width * 2 + height * 2;
    }
}
