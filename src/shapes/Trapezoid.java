package shapes;

public class Trapezoid implements Shape {

    public int bottom, top, height, side;

    public Trapezoid(int bottom, int top, int height, int side) {
        this.bottom = bottom;
        this.top = top;
        this.height = height;
        this.side = this.side;
    }

    @Override
    public double calculateArea() {
        return ((this.bottom + this.top) / 2) * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return (this.side * 2) + this.top + this.bottom;
    }

    @Override
    public String toString() {
        return String.format("Trapzeoid with Top: %d, Bottom: %d, Height %d, Side %d, Area: %f, Perimeter: %f.", this.top, this.bottom, this.height, this.side, this.calculateArea(), this.calculatePerimeter());
    }
}
