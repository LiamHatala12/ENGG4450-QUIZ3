public class Division {

    public static final long division(int a, int b) {
        long result = ((long) a) / ((long) b);
        return result;
    }

    public static final long divisionUsingLoop(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int absA = Math.abs(a);
        int absB = Math.abs(b);
        long result = 0;

        // Subtract absB from absA repeatedly and count how many times
        while (absA >= absB) {
            absA -= absB;
            result++;
        }

        // Adjust the sign of the result
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingRecursion(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long result = 1;
        int diff = absA - absB;
        if (diff > 0 && diff <= 1) {
            return result;
        } else if (diff < 0) {
            return 0;
        }

        result += divisionUsingRecursion(diff, absB);
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingMultiplication(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int absA = Math.abs(a);
        int absB = Math.abs(b);
        long result = 0;

        // Increment the result using multiplication until the product exceeds absA
        while (absB * result <= absA) {
            result++;
        }

        // Adjust the result because the last multiplication may overshoot
        result--;

        // Adjust the sign of the result
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingShift(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int tempA, tempB, counter;

        long result = 0L;
        while (absA >= absB) {
            tempA = absA >> 1; // Right shift "a"
            tempB = absB;
            counter = 1;
            while (tempA >= tempB) { // Double "tempB" until it's larger than
                                     // "tempA"
                tempB <<= 1;
                counter <<= 1; // Double the counter
            }
            absA -= tempB; // Subtract "tempB" from "a"
            result += counter; // Add counter (2^number of left shifts)
        }
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingLogs(int a, int b) {
        long absA = Math.abs(a);
        long absB = Math.abs(b);
        double logBase10A = Math.log10(absA);
        double logBase10B = Math.log10(absB);
        double powOf10 = Math.pow(10, (logBase10A - logBase10B));
        long result = (long) Math.floor(powOf10);
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }
}