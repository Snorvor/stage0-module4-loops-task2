package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 0;
        while (number <= printToInclusive) {
            if (number <= 1) {
                // 0 and 1 are not prime
            } else if (number == 2) {
                System.out.println(number);
            } else if (number % 2 == 0) {
                // Even numbers greater than 2 are not prime
            } else {
                int divisor = 3;
                boolean isPrime = true;
                while (divisor * divisor <= number && isPrime) {
                    if (number % divisor == 0) {
                        isPrime = false;
                    }
                    divisor += 2; // Check only odd divisors
                }
                if (isPrime) {
                    System.out.println(number);
                }
            }
            number++;
        }
    }
}
