public class QuantityMeasurementApp {

    // =======================
    // UC1: Feet Measurement
    // =======================
    static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    // =======================
    // UC2: Inches Measurement
    // =======================
    static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    // =======================
    // UC1 Method: Feet Equality
    // =======================
    public static boolean areFeetEqual(double v1, double v2) {
        Feet f1 = new Feet(v1);
        Feet f2 = new Feet(v2);
        return f1.equals(f2);
    }

    // =======================
    // UC2 Method: Inches Equality
    // =======================
    public static boolean areInchesEqual(double v1, double v2) {
        Inches i1 = new Inches(v1);
        Inches i2 = new Inches(v2);
        return i1.equals(i2);
    }
    // =======================
    // UC3: Length Unit Enum
    // =======================
    enum LengthUnit {

        FEET(12.0),
        INCH(1.0),

        // UC4 additions
        YARD(36.0),          // 1 yard = 36 inches
        CENTIMETER(0.393701); // 1 cm = 0.393701 inches

        private final double factor;

        LengthUnit(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }

    // =======================
    // UC3: Generic Quantity Class
    // =======================
    static class QuantityLength {
        private final double value;
        private final LengthUnit unit;

        public QuantityLength(double value, LengthUnit unit) {
            this.value = value;
            this.unit = unit;
        }

        private double toInches() {
            return value * unit.getFactor();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            QuantityLength other = (QuantityLength) obj;
            return Double.compare(this.toInches(), other.toInches()) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(toInches());
        }
    }

    // =======================
    // UC3 Method (Cross Unit Comparison)
    // =======================
    public static boolean areQuantitiesEqual(double v1, LengthUnit u1, double v2, LengthUnit u2) {
        QuantityLength q1 = new QuantityLength(v1, u1);
        QuantityLength q2 = new QuantityLength(v2, u2);
        return q1.equals(q2);
    }

    // =======================
    // MAIN METHOD
    // =======================
    public static void main(String[] args) {

        // UC1 Execution (Feet)
        boolean feetResult = areFeetEqual(1.0, 1.0);
        System.out.println("UC1 - Input: 1.0 ft and 1.0 ft");
        System.out.println("UC1 - Output: Equal (" + feetResult + ")");

        // UC2 Execution (Inches)
        boolean inchResult = areInchesEqual(1.0, 1.0);
        System.out.println("UC2 - Input: 1.0 inch and 1.0 inch");
        System.out.println("UC2 - Output: Equal (" + inchResult + ")");

        // UC3 Execution (Cross Unit Comparison)
        boolean crossResult1 = areQuantitiesEqual(1.0, LengthUnit.FEET, 12.0, LengthUnit.INCH);
        System.out.println("UC3 - Input: 1.0 ft and 12.0 inch");
        System.out.println("UC3 - Output: Equal (" + crossResult1 + ")");

        boolean crossResult2 = areQuantitiesEqual(1.0, LengthUnit.FEET, 13.0, LengthUnit.INCH);
        System.out.println("UC3 - Input: 1.0 ft and 13.0 inch");
        System.out.println("UC3 - Output: Equal (" + crossResult2 + ")");


    }
}