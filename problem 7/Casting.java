// Java Program demonstrating upcasting and downcasting
class ParentClass {
  void display() {
     System.out.println("This is Parent Class");
  }
}

class ChildClass extends ParentClass{
  void display() {
    System.out.println("This is Child class");
  }
}

public class Casting {

  public static void main(String args[]) {
  
  ParentClass p = new ParentClass();
  ChildClass c = new ChildClass();
  p.display();
  c.display();

  // Upcasting
  p = (ParentClass) c;
  p.display();
  
  // Downcasting
  ParentClass q = new ChildClass();
  ChildClass d = (ChildClass) q;
  d.display();
  }
}
