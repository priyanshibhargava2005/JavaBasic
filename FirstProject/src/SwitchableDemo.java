//class: noun, interface: adjective
interface Switchable{
    void turnOn();
    void turnOff();
}

class Fan implements Switchable{

    @Override
    public void turnOn(){
        System.out.println("Fan is on");
    }

    @Override
    public void turnOff(){
        System.out.println("Fan is off");
    }
}

class TV implements Switchable{

    @Override
    public void turnOn(){
        System.out.println("TV is on");
    }

    @Override
    public void turnOff(){
        System.out.println("TV is off");
    }
}

public class SwitchableDemo {
    public static void main(String[] args){
        Fan fan = new Fan();
        fan.turnOn();

        Switchable tv1= new TV();
        tv1.turnOn();
        Switchable fan1=new Fan();
        fan1.turnOff();
        }
}