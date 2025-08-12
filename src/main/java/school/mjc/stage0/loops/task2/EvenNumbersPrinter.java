package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int initialNumber = 0;
        while (initialNumber % 2 == 0 && initialNumber <= printTillInclusive) {
            System.out.println(initialNumber);
            initialNumber++;
            System.out.println(initialNumber);
        }
    }
}
