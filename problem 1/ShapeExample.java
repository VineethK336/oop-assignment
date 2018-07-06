class Shape {
  double length, width;

  Shape() {
  length = 0;
  width = 0;
  }

  Shape(double l) {
    length = l;
    width = l;
  }
  
  Shape(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double getArea() {
    return length * width;
  }

  double getPerimeter() {
    return length + width;
  }

}


class Circle extends Shape {
  double radius;
  
  Circle(double radius) {
    this.radius = radius;
  }

  double getArea() {
    return 3.14 * radius * radius;
  }

  double getPerimeter() {
    return 2 * 3.14 * radius;
  }

}

class Square extends Shape{
  
  Square(double s) {
    super(s);
  }

}

class ShapeExample {

  public static void main(String args[]) {
    Circle c = new Circle(3);
    Square s = new Square(4);
    System.out.println(s.getArea());
    System.out.println(s.getPerimeter());
    System.out.println(c.getArea());
    System.out.println(c.getPerimeter());
  }
}


