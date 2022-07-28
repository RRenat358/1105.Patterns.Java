
import java.math.BigDecimal;


public class FixedDiscount implements Discountable {

    private final BigDecimal discount;

    public FixedDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal value) {
        return value.subtract(discount);
    }


}
