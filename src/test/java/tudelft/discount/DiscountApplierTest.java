package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @Test
    void checkDiscount() {

        Product frank = new Product("Frank", 200.0, "BUSINESS");
        Product peter = new Product("Peter", 300.0, "HOME");

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(frank, peter);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier discount = new DiscountApplier(dao);

        Assertions.assertEquals(frank, results.get(0));
        Assertions.assertEquals(200.0, results.get(0).getPrice());
    }
}
