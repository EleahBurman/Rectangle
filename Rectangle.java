public class Rectangle {
    private int length;
    private int width;

    // No-argument constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Parameterized constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int newLength) {
        if (newLength < 0) {
            System.err.println("Length cannot be negative. No black holes");
            return;
        }
        this.length = newLength; // Assuming you still want to set the length if valid
    }
    

    public String toString() {
        return "Rectangle {length: " + length + ", width: " + width + "}";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // Uses no-argument constructor
        Rectangle r2 = new Rectangle(10, 20); // Uses parameterized constructor

        System.out.println(r1); // Rectangle {length: 0, width: 0}
        System.out.println(r2); // Rectangle {length: 10, width: 20}
    }
}
