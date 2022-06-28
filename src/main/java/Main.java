import java.util.List;

public class Main {
    // implement the public averageList method here

    public static Double averageList(List<? extends Number> numberList) {

        double sum = 0;

        for (Number item : numberList) {
            sum += item.doubleValue();
        }

        int length = numberList.size();

        return sum / length;

    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println(averageList(intList)); // 3.0

        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(averageList(doubleList)); // 3.0
    }
}
