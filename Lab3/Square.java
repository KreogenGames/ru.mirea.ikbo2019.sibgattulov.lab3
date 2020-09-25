package Lab3;

public class Square extends Rectangle {
    public Square(){
        super();
    }

    public Square(double side)
    {
        super(side, side);
    }

    public  Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide()
    {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return "Shape: square's parameters are side " + this.width + ", color " + color + ", is filled " + filled;
    }
}
