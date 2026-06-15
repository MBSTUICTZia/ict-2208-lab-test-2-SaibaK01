public class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String color, boolean filled, double length, double width){
        super(color,filled);
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
    @Override
    public String toString() {

        String result = "[ Rectangle ]\n";
        result += super.toString() + "\n";
        result += "Width : " + width + "\n";
        result += "Length: " + length + "\n";
        result += String.format("Area      : %.2f", getArea()) + "\n";
        result += String.format("Perimeter : %.2f", getPerimeter());
        return result;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
}
