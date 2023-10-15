package Strategy_Pattern.store;
// 6510451123 อาณัฏฐชา กรรภิรมย์
import java.util.List;

public class Quantity implements Counter {
    @Override
    public int count(List<Product> products) {
        int count = 0;
        for (Product prod : products) {
            count += prod.getQuantity();
        }
        return count;
    }
}