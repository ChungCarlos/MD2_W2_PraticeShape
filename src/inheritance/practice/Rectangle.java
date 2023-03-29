package inheritance.practice;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length,String color,boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length * width;
    }
    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return " A Rectangle is Area: "
                + getArea()
                + " and Perimeter: "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString(); // lấy chuỗi của toString() của lớp Shape (lớp cha)...
    }
}
class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
