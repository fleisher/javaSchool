package lesson01.task02;

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
