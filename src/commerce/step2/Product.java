package commerce.step2;

public class Product {
    String name;
    int price;
    String description;
    int stock;

    public Product(String name, int price, String description, int stock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    // toString
    @Override
    public String toString() {
        return name + " | " + price + " | " + description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }
}
