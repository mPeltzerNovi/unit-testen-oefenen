import java.util.Arrays;

public class Counter {

    private int total = 0;

    public void add(int getal) {
        total += getal;
    }

    public void add(int[] numbers) {
        total = this.addWithLoop(numbers);
//        this.addWithStream(numbers);
    }

    public static int addWithLoop(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int addWithStream(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    public void reset() {
        total = 0;
    }

    public int getTotal() {
        return total;
    }

    public static int getSmallestNumber(int[] numbers) {
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    public static int getMaxWithStream(int[] numbers) {

        return Arrays.stream(numbers).max().orElse(0);
    }

    //Hier door op de rode getMaximum in "CounterTest" te drukken is de methode gekomen!!!
    //Deze maken om de methode bij de eerst gemaakte test te bouwen
    public int getMaximum(int[] numbers) {
        return getMaxWithStream(numbers);
    }
}

