package _06_inheritance.bai_tap.circle;

public class TestMain {
    public static void main(String[] args) {
        Circle circle =new Circle(2,"red");
        System.out.println(circle);
        System.out.println("diện tích hình tròn là:"+circle.getArea());
        Cylinder cylinder=new Cylinder(2,"blue",5);
        System.out.println(cylinder);
        System.out.println("thể tích hình trụ là:"+cylinder.getVolume());
    }
}
