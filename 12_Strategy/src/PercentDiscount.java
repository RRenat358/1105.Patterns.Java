
import java.math.BigDecimal;


public class PercentDiscount implements Discountable {

    private final BigDecimal discount;

    public PercentDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal value) {
        return value.multiply(BigDecimal.ONE.subtract(discount));
    }


}
