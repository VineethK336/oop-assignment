// Checks if name given contains vineeth else raises

import java.util.Scanner;

class MyNameNotFound extends Exception {

  public MyNameNotFound(String msg) {
    super(msg);
  }
  
}

public class CustomException {

  public static void main(String args[]) throws MyNameNotFound{

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    if(name.toLowerCase().contains("vineeth")) {
      System.out.println("Hello " + name);
    }
    else {
      MyNameNotFound excep = new MyNameNotFound("My name not found");
      throw excep;
    }

  }
}
