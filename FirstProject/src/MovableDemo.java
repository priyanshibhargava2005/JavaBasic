//class: noun, interface: adjective
interface Movable{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable{

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public String tostring(){
        System.out.println("x: "+x+",y: " +y);
    }

    public String moveUp(){
        y-=ySpeed;
    }
    
    public String moveDown(){
        y+=ySpeed;
    }
    
    public String moveLeft(){
        x-=xSpeed;
    }
    
    public String moveUp(){
        x+=ySpeed;
    }
    
    // @Override
    // public void moves(){
    //     System.out.println("Cat moves");
    // }

    // @Override
    // public void doesntmove(){
    //     System.out.println("Table doesnt move");
    // }
}

public class MovableCircle implements Movable {
  private int radius;
  private MovablePoint center;

  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    center = new MovablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;
  }

  public String toString() {
    return "x: " + center.x + ", y: " + center.y + ", radius: " + radius;
  }

  public void moveUp() {
    center.y -= center.ySpeed;
  }

  public void moveDown() {
    center.y += center.ySpeed;
  }

  public void moveLeft() {
    center.x -= center.xSpeed;
  }

  public void moveRight() {
    center.x += center.xSpeed;
  }
}


public class MovableDemo {
    public static void main(String[] args){
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        Movable m2 = new MovableCircle(2, 1, 2, 3, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        }
}