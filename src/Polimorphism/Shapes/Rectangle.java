package Polimorphism.Shapes;

public class Rectangle extends Shape {
    private final Double width;
    private final Double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculatePerimeter(){
        if (super.getPerimeter() == null) {
            super.setPerimeter(this.width * 2 + this.height * 2);
        }
        return super.getPerimeter();
    }
    @Override
    public double calculateArea(){
        if (super.getArea() == null) {
            super.setArea(this.width * this.height);
        }
        return super.getArea();
    }

    public final double getHeight() {
        return height;
    }

    public final double getWidth() {
        return width;
    }
}
