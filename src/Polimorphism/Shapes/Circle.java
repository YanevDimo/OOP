package Polimorphism.Shapes;

public final class Circle extends Shape{
    private  final double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public final double calculatePerimeter() {
        if (super.getPerimeter() == null) {
            super.setPerimeter(2 * Math.PI * this.radius);
        }
        return super.getPerimeter();
    }

    @Override
    public double calculateArea() {
        if (super.getArea() == null) {
            super.setArea(Math.PI * this.radius * this.radius);
        }
        return super.getArea();
    }

    public final double getRadius() {
        return radius;
    }
}
