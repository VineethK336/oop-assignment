// Accessing private members of a class outside the class

class PrivateClass1 {
  
  class InnerPrivate {
    private double t = 123.567;
  }

  void displayPrivateVar() {
    InnerPrivate ip = new InnerPrivate();
    System.out.println("The private variable is: " + ip.t);
  }
}

public class PrivateClass {
  public static void main(String args[]) {
    PrivateClass1 p = new PrivateClass1();
    p.displayPrivateVar();
  }
}
