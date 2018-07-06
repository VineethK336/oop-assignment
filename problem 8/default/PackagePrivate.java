package p1;

// This class can be accesed only in the package p1
class PackagePrivate {

  int a = 10;
  double b = 100;

  PackagePrivate() {
  a = 10;
  b = 100;
  }

  void display() {
    System.out.println("a, b = " + a + ", " + b);
  }
}
