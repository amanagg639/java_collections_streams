package collections.queue_interface.circular_buffer;

import static java.lang.System.out;

class CircularBuffer {
    private final int[] buffer;
    private int head = 0;
    private int size = 0;
    private final int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
    }

    public void insert(int value) {
        buffer[head] = value;
        head = (head + 1) % capacity;
        if (size < capacity) size++;
    }

    public void printBuffer() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            int index = (head + i) % capacity;
            out.println(buffer[index] + (i < size - 1 ? ", " : "")); //with statically importing
        }
        System.out.println("]");
    }
}
