
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {

    public static void main(String[] args) {
        Product product = new Product(1L, "Product", new BigDecimal(100));

        ShoppingCart cart = new ShoppingCart();
        cart.setDiscountable(new FixedDiscount(new BigDecimal("0.1")));
        cart.addToCart(product);
        System.out.println("Total = " + cart.calcTotal());
    }



    private final Map<Long, Product> products = new HashMap<>();

    private Discountable discountable;

    public void addToCart(Product product) {
        products.put(product.getId(), product);
    }

    public void removeFromCart(Product product) {
        products.remove(product.getId());
    }

    public void setDiscountable(Discountable discountable) {
        this.discountable = discountable;
    }

    public BigDecimal calcTotal() {
        BigDecimal value = products.values().stream()
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        if (discountable != null) {
            value = discountable.applyDiscount(value);
        }
        return value;
    }


}
