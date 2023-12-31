package Strategy_Pattern.store;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class Product {
    private String name; // ชื่อสินค้า
    private double price; // ราคาสินค้า
    private int quantity; // จำนวนในสต็อคของสินค้านี้

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}