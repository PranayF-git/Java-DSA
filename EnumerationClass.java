enum Cars {
    BMW(25000), RangeRover, Porshe(189000), Cadillac(98621);

    private int price;

    private Cars() {
        price = 15000;
    }

    private Cars(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}

public class EnumerationClass {
    public static void main(String[] args) {
        for (Cars car : Cars.values()) {
            System.out.println(car + " : " + car.getPrice());
        }
    }
}
