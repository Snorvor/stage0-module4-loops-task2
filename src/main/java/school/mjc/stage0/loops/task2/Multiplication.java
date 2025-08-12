package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int value = 0;

        while (value <= multiplyByAndToInclusive) {
            System.out.println(value);
            value++;
            value = value * multiplyByAndToInclusive;
        }
    }
}
