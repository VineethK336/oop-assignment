// Java program demonstrating different forms of polymorphism,
// Overloading & overriding
class ParentClass {

  String name;
  ParentClass() {
    name = "Tej";
  }
  
  ParentClass(String name) {
    this.name = name;
  }

  void display() {
    System.out.println("Hello " + this.name + ". This is Parent Class");
  }

  // Method Overloading
  void display(String name) {
    System.out.println("Hello " + name + ". This is Parent Class"); 
  } 
}

class SubClass extends ParentClass {

  SubClass() {

  }

  SubClass(String name) {
    super(name);
  }

  // Method Overriding
  void display() {
    System.out.println("Hello " + this.name + ". This is Sub Class");
  }
}


class Polymorphism {

  public static void main(String args[]) {
    ParentClass p = new ParentClass();
    SubClass c = new SubClass();
    SubClass d = new SubClass("Rahul");
    
    p.display();
    p.display("Varun");
    c.display();
    d.display();
  }
}
