package web.model;

public class Car {
    private String model;
    private int year;
    private String price;

    public Car(String model, int year, String price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getPrice() {
        return price;
    }
}
