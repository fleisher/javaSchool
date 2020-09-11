package shapes;

class Square extends Shape{
        private float side;

        Square(float side) {
            name = "Square";
            this.side = side;
        }

        @Override
        public float getPerimeter() {
            return side * 4;
        }
    }
