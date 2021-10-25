package сom.company.task3;

public class Price {
    private String name;
    private String shop;
    private int money;

    public Price() {
    }

    public Price(String name, String shop, int money) {
        this.name = name;
        this.shop = shop;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getShop() {
        return shop;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Название товара: "+this.name+" цена товара: "+this.money+" грн.";
    }
}
