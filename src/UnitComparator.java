public class UnitComparator {

    public boolean compare(Unit number1, Unit number2) {
        if (number1 == null || number2 == null)
            return false;
        return number1.getUnitValue().equals(number2.getUnitValue());
    }
}
