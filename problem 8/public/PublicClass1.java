package p1;

// This class can be accesed in any other package also
public class PublicClass1 {

  int a = 10;
  double b = 100;

  public PublicClass1() {
  a = 10;
  b = 100;
  }

  public void display() {
    System.out.println("a, b = " + a + ", " + b);
  }
}
