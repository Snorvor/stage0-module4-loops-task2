package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }

        int exponent = 0;
        while (exponent <= power) {
            long result = (long) Math.pow(2, exponent);
            System.out.println(result);
            exponent++;
        }
    }
}
