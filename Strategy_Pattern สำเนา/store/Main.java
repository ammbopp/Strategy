package Strategy_Pattern.store;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct("Big Java", 300, 5);
        store.addProduct("Da Vinci Code", 120, 0);
        store.addProduct("Python 101", 200, 10);

        Counter allProductCounter = new AllProduct();
        Counter inStockCounter = new InStock();
        Counter quantityCounter = new Quantity();

        int allProductCount = store.countProduct(allProductCounter);
        int inStockCount = store.countProduct(inStockCounter);
        int quantityCount = store.countProduct(quantityCounter);

        System.out.println("All Products: " + allProductCount);
        System.out.println("Products In Stock: " + inStockCount);
        System.out.println("Quantity: " + quantityCount);
    }
}

