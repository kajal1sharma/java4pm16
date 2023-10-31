class Shape{
    public double getArea(){
        return 0;
    }

    public double getParameter(){
        return 0;
    }
}

class Circle extends Shape{
    int radius;
     public int getRadius() {
         return radius;
     }
     public void setRadius(int radius) {
         this.radius = radius;
     }
    Circle(){
        radius=5;
    }
    Circle(int rad){
        this.radius=rad;
    }
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }

    @Override
    public double getParameter(){
        return 2*3.14*radius;
    }
}

class Square extends Shape{
    int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    Square(){
        length=5;
    }
    Square(int length){
        this.length=length;
    }
     @Override
    public double getArea(){
        return length*length;
    }

    @Override
    public double getParameter(){
        return 4*length;
    }
}

class Rectangle extends Shape{
    private int length;
    private int breadth;

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public int getLength() {
        return length;
    }
    Rectangle(){
        length=5;
        breadth=5;
    }
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }


     @Override
    public double getArea(){
        return length*breadth;
    }

    @Override
    public double getParameter(){
        return 2*(length+breadth);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Square sc= new Square();
        System.out.println("area of square  = "+ sc.getArea());
        System.out.println("param of square = " +sc.getParameter());

        Rectangle r= new Rectangle(10, 20);
        System.out.println("area of rectangle = "+r.getArea());
        System.out.println("param of rectangle = "+r.getParameter());

        Circle c= new Circle(10);
        System.out.println("arae of circle = "+c.getArea());
        System.out.println("param of circle = "+c.getParameter());
    }    
}
