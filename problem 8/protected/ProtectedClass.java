package p1;

// This class can be accesed only in the package p1 or by its inherited classes
public class ProtectedClass {

  int a = 10;
  double b = 100;

  public ProtectedClass() {
  a = 10;
  b = 100;
  }

  protected void display() {
    System.out.println("a, b = " + a + ", " + b);
  }
}
