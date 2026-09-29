class Mobile {
    static String phone; //static variable syntax ("small 's' ")
    int price;
    String type;

    public void getData() {
        System.out.println(phone + " / " + price + " / " + type);
    }

    static {
        phone = "Huawei";
        System.out.println("Inside static block..");
    }

    public Mobile() {
        price = 450;
        type = "Android";
        System.out.println("Inside constructor..");
    }
}
public class staticBlock {
    

    public static void main(String args[]) throws ClassNotFoundException {
        Class.forName("Mobile");
    }
}
