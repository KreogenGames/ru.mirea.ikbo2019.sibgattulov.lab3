package Lab3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle()
    {
        this.length = 1;
        this.width = 1;
        this.color = "red";
        this.filled = false;
    }

    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
        this.color = "red";
        this.filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimeter(){
        return (width + length) * 2;
    }
    @Override
    public String toString(){
        return "Shape: rectangle's parameters are width " + this.width + ", length " + this.length + ", color " + this.color + "is filled " + this.filled ;
    }
}
