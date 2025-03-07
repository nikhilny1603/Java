package MyMath;

public class Stat {
    public double min(double... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("At least one value is required.");
        }
        double min = values[0];
        for (double value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public double max(double... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("At least one value is required.");
        }
        double max = values[0];
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int count(double... values) {
        return values.length;
    }

    public double sum(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }

    public double average(double... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("At least one value is required.");
        }
        return sum(values) / values.length;
    }
}
