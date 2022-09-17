public class Main {
    public static void main(String[] args) {

rectangle a = new rectangle();
rectangle b = new rectangle(5,6);
rectangle c = new rectangle(6,8,4,5);
b.setWidth(9);
c.setXY(2,1);

System.out.println(c.calculateArea());
System.out.println(b.calculatePerimeter());
System.out.println(b.getX() + c.getY());
System.out.println("The area of the b rectangle is " + b.calculateArea());
    }
}