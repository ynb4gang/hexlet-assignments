package exercise;

// BEGIN
public class MinThread extends Thread {
    int[] numbers;
    int min;

    MinThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int run(int[] numbers) {
        int minim = numbers[0];

        for (int currentNumber : numbers) {
            if (currentNumber < minim) {
                minim = currentNumber;
            }
        }
        min = minim;
    }

    public int getMin() {
        return min;
    }
}
// END
