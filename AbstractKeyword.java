abstract class Car{
    abstract void drive();

    abstract void playMusic();

    void manual() {
        System.out.println("It is a manual car");
    }
}

class Supercar extends Car{  //Concrete class
    void drive() {
        System.out.println("Driving...");
    }

    void playMusic() {
        System.out.println("Playing music");
    }
}

class AbstractKeyword{
    public static void main(String args[]){
        Supercar obj = new Supercar();
        obj.drive();
        obj.playMusic();
        obj.manual();
    }
}