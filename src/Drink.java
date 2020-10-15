public class Drink {

    private String name;
    private int price;
    private boolean withAlcohol;

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

    public boolean isWithAlcohol() {
        return withAlcohol;
    }

    public void setWithAlcohol(boolean withAlcohol) {
        this.withAlcohol = withAlcohol;
    }

    public Drink(String name, int price, boolean withAlcohol) {
        this.name = name;
        this.price = price;
        this.withAlcohol = withAlcohol;
    }
}
