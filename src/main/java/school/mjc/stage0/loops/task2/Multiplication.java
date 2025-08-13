package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int number = 0;
        while (number <= multiplyByAndToInclusive) {
            System.out.println(number * 2);
            number++;  // Critical: This prevents infinite looping
        }
    }
}
