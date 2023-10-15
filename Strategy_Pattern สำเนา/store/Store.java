package Strategy_Pattern.store;
// 6510451123 อาณัฏฐชา กรรภิรมย์
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;
    public Store() { products = new ArrayList<>(); }
    public void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
    }
    // นับจำนวนสินค้าทั้งหมด ทั้งมีในสต็อคหรือหมดสต็อคแล้ว
    public int countAllProduct() {
        int count = 0;
        for (Product prod : products) {
            count += 1;
        }
        return count;
    }
    // นับจำนวนสินค้าทั้งหมดที่มีเหลืออยู่ในสต็อค
    public int countProductInStock() {
        int count = 0;
        for (Product prod : products) {
            if (prod.getQuantity() > 0)
                count += 1;
        }
        return count;
    }
    // นับจำนวนในสต็อคของสินค้าทั้งหมด
    public int countProductQuantity() {
        int count = 0;
        for (Product prod : products) {
            count += prod.getQuantity();
        }
        return count;
    }
    public int countProduct(Counter counter) {
        return counter.count(products);
    }
}