class staticVariable {
    static String phone; //static variable syntax ("small 's' ")
    int price;
    String type;

    public void getData() {
        System.out.println(phone + " / " + price + " / " + type);
    }

    public static void main(String args[]) {
        staticVariable obj = new staticVariable();
        staticVariable.phone = "Apple";
        obj.price = 2550;
        obj.type = "iOS";

        staticVariable obj2 = new staticVariable();
        staticVariable.phone = "Samsung";
        obj2.price = 1200;
        obj2.type = "Android";

        obj.getData();
        obj2.getData();
    }
}