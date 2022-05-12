package _06_inheritance.bai_tap;

public class Cylinder extends Circle{
    double height;
    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getPI()*getRadius()*2*getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
