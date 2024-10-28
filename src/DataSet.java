import java.util.ArrayList;
public class DataSet {
    private ArrayList<Double> values;
    public DataSet() {
        values = new ArrayList<>();
    }
    public void add(double value) {
        values.add(value);
    }
    public double getAverage() {
        if (values.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    public double getSmallest() {
        if (values.isEmpty()) {
            return 0;
        }
        double smallest = values.get(0);
        for (double value : values) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    public double getLargest() {
        if (values.isEmpty()) {
            return 0;
        }
        double largest = values.get(0);
        for (double value : values) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    public double getRange() {
        return getLargest() - getSmallest();
    }
}
