package p1;

class SamePackage {

  public static void main(String args[]) {
    // Both the below lines will work
    PackagePrivate p = new PackagePrivate();
    p.display();
  }
}
