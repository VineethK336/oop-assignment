package p2;

import p1.*;

class AccessProtected1 extends p1.ProtectedExample {
  
  void disp() {
    super.display();
  }
}

class AccessProtected {
  public static void main(String args[]) {
    AccessProtected1 ap = new AccessProtected1();
    ap.disp();
  }
}
