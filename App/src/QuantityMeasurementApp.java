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
    }
}