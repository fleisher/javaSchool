package lesson01.task02;

class Triangle extends Shape{
        private float a;
        private float b;
        private float c;

        Triangle(float a, float b, float c){
            name = "Triangle";
            this.a = a;
            this.b = b;
            this.c = c;
        }
        @Override
        public float getPerimeter(){
            return a + b + c;
        }
    }
