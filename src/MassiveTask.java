import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MassiveTask  {

    public double []  arrayCreateAndAddElements() {
        double [] array = new double[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public Map<String, Double> MinMaxAvg(double [] array) {
        double min = array[0];
        double max = array[0];

        HashMap<String , Double> MinMaxMiddle = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        MinMaxMiddle.put("Min ", min);
        MinMaxMiddle.put("Max ", max);
        MinMaxMiddle.put("Avg ", (min + max) / 2);
        return MinMaxMiddle;
    }

    public void printList(double[] array) {
        for (Double element : array) {
            System.out.println(element);
        }
    }

}
