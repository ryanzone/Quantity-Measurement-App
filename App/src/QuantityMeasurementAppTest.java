import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    // =======================
    // UC1: Feet Tests
    // =======================

    @Test
    void testEquality_SameValue_Feet() {
        assertTrue(QuantityMeasurementApp.areFeetEqual(1.0, 1.0),
                "1.0 ft should equal 1.0 ft");
    }

    @Test
    void testEquality_DifferentValue_Feet() {
        assertFalse(QuantityMeasurementApp.areFeetEqual(1.0, 2.0),
                "1.0 ft should not equal 2.0 ft");
    }

    @Test
    void testEquality_NullComparison_Feet() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(f.equals(null),
                "Feet should not be equal to null");
    }

    @Test
    void testEquality_SameReference_Feet() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(f.equals(f),
                "Same Feet reference should be equal");
    }

    @Test
    void testEquality_NonNumericInput_Feet() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(f.equals("1.0"),
                "Feet should not equal a String");
    }


    // =======================
    // UC2: Inches Tests
    // =======================

    @Test
    void testEquality_SameValue_Inches() {
        assertTrue(QuantityMeasurementApp.areInchesEqual(1.0, 1.0),
                "1.0 inch should equal 1.0 inch");
    }

    @Test
    void testEquality_DifferentValue_Inches() {
        assertFalse(QuantityMeasurementApp.areInchesEqual(1.0, 2.0),
                "1.0 inch should not equal 2.0 inch");
    }

    @Test
    void testEquality_NullComparison_Inches() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i.equals(null),
                "Inches should not be equal to null");
    }

    @Test
    void testEquality_SameReference_Inches() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(i.equals(i),
                "Same Inches reference should be equal");
    }

    @Test
    void testEquality_NonNumericInput_Inches() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i.equals(100),
                "Inches should not equal non-Inches type");
    }
    // =======================
    // UC3: Cross Unit Tests
    // =======================

    @Test
    void testEquality_FeetToInch_Equal() {
        assertTrue(QuantityMeasurementApp.areQuantitiesEqual(
                1.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                12.0,
                QuantityMeasurementApp.LengthUnit.INCH
        ));
    }

    @Test
    void testEquality_FeetToInch_NotEqual() {
        assertFalse(QuantityMeasurementApp.areQuantitiesEqual(
                1.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                13.0,
                QuantityMeasurementApp.LengthUnit.INCH
        ));
    }
}