abstract class ShapeB{
    static int numberofshapes=0;

    ShapeB(){
        numberofshapes++;
    }
//abstract method can only be created in an abstract class
    abstract void draw();
    
    static void displaytotalshapes(){
    System.out.println("Total number of shapes: "+ numberofshapes);
    }

    void displayInfo(){
        System.out.println("This is a shape. ");
    }
}

class CircleB extends ShapeB{
    @Override
    void draw(){
        System.out.println("drawing circle");
    }
}

class SquareB extends ShapeB{
    @Override
    void draw(){
        System.out.println("drawing square");
    }
}

public class Abstraction{
    public static void main(String[] args){
        CircleB circleB=new CircleB();
        circleB.draw();
        circleB.displayInfo();

        //upcasting
        ShapeB squareB = new SquareB();
        squareB.draw();
        ShapeB circleC=new CircleB();
        circleB.draw();
    }
}