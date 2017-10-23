package shapes;

public class Triangle implements Shape {

    public int base, side, hypot;

    public Triangle(int base, int side, int hypot) {
        this.base = base;
        this.side = side;
        this.hypot = hypot;
    }

    @Override
    public double calculateArea() {
        return (1/2)*this.base*this.side;
    }

    @Override
    public double calculatePerimeter() {
        return this.base + this.side + this.hypot;
    }

    @Override
    public String toString() {
        return String.format("Triangle with Side: %d, Base: %d, Hypotenuse: %d, Area: %f, Perimeter: %f.", this.side, this.base, this.hypot, this.calculateArea(), this.calculatePerimeter());
    }
}
