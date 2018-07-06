class Account{
  
  int number;
  String name;

  Account(int number, String name) {
    this.number = number;
    this.name = name;
  }

  int getNumber() {
    return number;
  }
  
  String getName() {
    return name;
  }
}



public class ObjectClassExample1 {

  public static void main(String args[]) {
    Account acc1 = new Account(123, "Ramesh");
    Account acc2 = new Account(456, "Kiran");
    System.out.println(acc1.toString());
    if(acc1.equals(acc2)) {
      System.out.println("acc1 and acc2 are equal");
    }
    else {
      System.out.println("acc1 and acc2 are not equal");
    }
  }
}
