public class Rect {
    private int length;
    private int width;

    @Override
    public String toString() {
        return "Rect{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public int calculatePerimeter() {
        return (length + width) + (length + width);
    }

    public int calculateSquare() {
        return length * width;
    }

    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
