public class Drink {
    private String name;
    private int price;
    private boolean withAlkohol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean withAlkohol() {
        return withAlkohol;
    }

    public void setWithAlkohol(boolean withAlkohol) {
        this.withAlkohol = withAlkohol;
    }

    public Drink(String name, int price, boolean withAlkohol) {
        this.name = name;
        this.price = price;
        this.withAlkohol = withAlkohol;
    }
}
