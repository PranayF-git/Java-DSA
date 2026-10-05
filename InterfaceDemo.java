interface Computer {
    void Code();
}

class Laptop implements Computer {
    public void Code() {
        System.out.println("Coding is comfortable on Laptop");
    }
}

class Desktop implements Computer {
    public void Code() {
        System.out.println("Heavy code can be write & run effortlessly on Desktop");
    }
}

class Developer {
    public void devCodes(Computer comp) {
        comp.Code();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer pranay = new Developer();
        pranay.devCodes(lap);
    }
}
