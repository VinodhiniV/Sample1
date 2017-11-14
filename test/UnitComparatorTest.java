import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class UnitComparatorTest {
    @Test
    public void shouldCompareTwoInchesAndReturnTrueIfEqual() {
        Boolean expected = true;

        Unit feet = new Feet(1.0);
        Unit inch = new Inch(12.0);

        UnitComparator unitComparator = new UnitComparator();
        boolean compare = unitComparator.compare(feet, inch);

        Assert.assertThat(expected, is(compare));
    }

    @Test
    public void shouldCompareTwoInchesAndReturnFalseIfNotEqual() {
        Boolean expected = false;
        Unit feet = new Feet(2.0);
        Unit inch = new Inch(12.0);

        UnitComparator unitComparator = new UnitComparator();
        boolean compare = unitComparator.compare(feet, inch);

        Assert.assertThat(expected, is(compare));
    }

    @Test
    public void shouldReturnFalseIfFirstNumberIsNull() {
        Boolean expected = false;

        Unit feet = new Feet(1.0);

        UnitComparator unitComparator = new UnitComparator();
        boolean compare = unitComparator.compare(null, feet);

        Assert.assertThat(expected, is(compare));
    }

    @Test
    public void shouldReturnFalseIfSecondNumberIsNull() {
        Boolean expected = false;
        UnitComparator unitComparator = new UnitComparator();

        Unit inch = new Inch(1.0);

        boolean compare = unitComparator.compare(inch, null);

        Assert.assertThat(expected, is(compare));
    }
}
