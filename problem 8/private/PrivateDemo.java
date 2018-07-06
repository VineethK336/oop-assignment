class Private {
   private int b;
   
   Private() {

  }
   Private(int a) {
      b = a;
   }

   void display() {
    System.out.println("b = " + b);
  }
}

class PrivateDemo {

  public static void main(String args[]) {
    Private p = new Private(10);
    // This will cause an error
    //System.out.println(p.b)

    // Private members are generally accessed using class's public methods
    p.display();
  }
}
