// Java program demonstrating Dynamic Binding
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

class GrandChildClass extends ChildClass {
  void display() {
    System.out.println("This is Grandchild class");
  }
}

public class DynamicBinding {
  public static void main(String args[]) {
  
    ParentClass p = new ParentClass();
    p.display();
    
    p = new ChildClass();
    p.display();
    
    p = new GrandChildClass();
    p.display();
  }
}

