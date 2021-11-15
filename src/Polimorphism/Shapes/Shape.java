package Polimorphism.Shapes;

public abstract class Shape {
  private Double area;
  private Double perimeter;


    public abstract double calculatePerimeter();
    public abstract double calculateArea();

    public Double getArea() {
        return area;
    }
    protected void setArea(Double area){
        this.area = area;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getPerimeter() {
        return perimeter;
    }
}
