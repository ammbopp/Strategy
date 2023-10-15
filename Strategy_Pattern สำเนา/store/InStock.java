package Strategy_Pattern.store;
// 6510451123 อาณัฏฐชา กรรภิรมย์
import java.util.List;

public class InStock implements Counter {
    @Override
    public int count(List<Product> products) {
        int count = 0;
        for (Product prod : products) {
            if (prod.getQuantity() > 0)
                count += 1;
        }
        return count;
    }
}
