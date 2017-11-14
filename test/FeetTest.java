import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FeetTest {

    @Test
    public void shouldReturnInchValue() {

        Double expected = 24.0;

        Feet feet = new Feet(2.0);

        Assert.assertThat(expected, is(feet.getUnitValue()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenNullValueIsGiven() {
        new Feet(null);
    }

}
