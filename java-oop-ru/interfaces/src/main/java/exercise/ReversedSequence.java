package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private final String original;

    public ReversedSequence(String original) {
        this.original = original;
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= original.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return original.charAt(original.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > original.length() || start > end) {
            throw new IndexOutOfBoundsException("Invalid start or end index");
        }
        return new ReversedSequence(original.substring(original.length() - end, original.length() - start));
    }

    @Override
    public String toString() {
        return new StringBuilder(original).reverse().toString();
    }
}
// END
