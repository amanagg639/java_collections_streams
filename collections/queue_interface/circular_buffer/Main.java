package collections.queue_interface.circular_buffer;

public class Main {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.printBuffer(); // [1, 2, 3]

        cb.insert(4);
        cb.printBuffer(); // [2, 3, 4]

    }
}