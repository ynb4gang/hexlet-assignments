package exercise;

// BEGIN
public class MaxThread extends Thread {
    private int max;
    private int[] numbers;

    MaxThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int maxim = numbers[0];

        for (int currentNumber : numbers) {
            if (currentNumber > maxim) {
                maxim = currentNumber;
            }
        }
        max = maxim;
    }

    public int getMax() {
        return max;
    } 
}
// END
