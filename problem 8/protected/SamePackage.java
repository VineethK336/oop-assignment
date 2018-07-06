package p1;

class SamePackage {

  public static void main(String args[]) {
    // Both the below lines will work
    ProtectedClass p = new ProtectedClass();
    p.display();
  }
}
