package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2; // Start checking from 2 (0 and 1 are not primes)

        while (number <= printToInclusive) {
            boolean isPrime = true;
            int divisor = 2;

            // Check if 'number' is prime
            while (divisor * divisor <= number) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }

            if (isPrime && number > 1) {
                System.out.println(number);
            }

            number++;
        }
    }
}
