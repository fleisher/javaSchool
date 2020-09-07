package lesson01.task02;

abstract class Shape{
    String name;

    public abstract float getPerimeter();
    public void printPerimetr(){
        System.out.println(name + " perimetr = " + getPerimeter());
    }
}
