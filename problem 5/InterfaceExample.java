interface Design1 {
  
  void incSpeed();
  void decSpeed();

}

interface Design2 {
  
  void gearUp();
  void gearDown();
}

interface Design3 {
  void lightOn();
  void lightOff();
}

abstract class Model1 implements Design3{
  int light = 0;

  public void lightOn() {
    this.light = 1;
  }
}

class FinalModel extends Model1 implements Design1, Design2{
  int gear;
  double speed;

  public void incSpeed() {
    this.speed += 12;
  }

  public void decSpeed() {
     if(this.speed >=12) {
       this.speed -= 12;
     }
  }

  public void gearUp() {
    if(gear<5) {
      gear += 1;
    }
  }

  public void gearDown() {
    if(gear>0) {
       gear -= 1;
    }
  }

  public void lightOff() {
     this.light = 0;
  }
}

public class InterfaceExample {

  public static void main(String args[]) {
    FinalModel m = new FinalModel();
    //System.out.println(m.speed + " " + m.gear + m.light);
    m.lightOn();
    System.out.println("light on: "+ m.light);
    m.gearUp();
    System.out.println("Gear up: " + m.gear);
    System.out.println("Speed: " + m.speed);
    m.incSpeed();
    m.incSpeed();
    System.out.println("Speed: " + m.speed);
  }

}



