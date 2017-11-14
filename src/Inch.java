public class Inch implements Unit {

    Double value;

    public Inch(Double value) {
        if (value == null) {
            throw new IllegalArgumentException("Null is not valid argument");
        }
        this.value = value;
    }

    public Double getUnitValue() {
        return value;
    }

}
