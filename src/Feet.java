public class Feet implements Unit {

    Double value;

    public Feet(Double value) {
        if (value == null) {
            throw new IllegalArgumentException("Null is not valid argument");
        }
        this.value = value;
    }

    public Double getUnitValue() {
        return 12 * value;
    }
}
