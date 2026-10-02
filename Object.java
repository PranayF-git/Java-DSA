class Car {
    String brand;
    String model;
    int price;

    boolean Compare(Car that) {
        if (this.brand == that.brand && this.model == that.model && this.price == that.price) {
            return true;
        } else {
            return false;
        }
    }
}

class Object{
    public static void main(String args[]){
        Car obj = new Car();
        obj.brand = "Land Rover";
        obj.model = "Range Rover";
        obj.price = 25050;
        Car obj2 = new Car();
        obj2.brand = "Land Rover";
        obj2.model = "Range Rover";
        obj2.price = 25050;

        boolean cmp = (obj.Compare(obj2));
        System.out.println(cmp);
    }
}