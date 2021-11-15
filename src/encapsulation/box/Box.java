package encapsulation.box;

public class Box {
    private double length;
    private double height;
    private double width;

    public Box(double length, double height, double width) {
        this.setLength(length);//invoke setter for validation
        this.setHeight(height);//invoke setter for validation
        this.setWidth(width);//invoke setter for validation

    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative");
        }
        this.length = length;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative");
        }
        this.height = height;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative");
        }
        this.width = width;
    }

    public double calculateVolume() {
        return height * width * length;
    }

    public double calculateLateralSurfaceAria() {
        return 2 * length * height + 2 * width * height;
    }
    public double calculateSurfaceAria(){
        return 2 * (length * height + length * width + width * height);
    }
}
