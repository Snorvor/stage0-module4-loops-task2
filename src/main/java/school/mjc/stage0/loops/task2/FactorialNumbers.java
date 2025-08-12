package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;
        while (number <= printToInclusive) {
            long result = 1;
            if (number == 0) {
                result = 1;
            } else {
                int i = 1;
                while (i <= number) {
                    result *= i;
                    i++;
                }
            }
            System.out.println(result);
            number++;
        }
    }
}
