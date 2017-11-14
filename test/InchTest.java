import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
//some comment

public class InchTest {
    @Test
    public void shouldReturnSameValueAsUnitValue() {
        Assert.assertThat(2.0, is(new Inch(2.0).getUnitValue()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenNullValueIsGiven() {
        new Inch(null);
    }
}
