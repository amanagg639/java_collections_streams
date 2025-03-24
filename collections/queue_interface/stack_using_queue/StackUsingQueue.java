package collections.queue_interface.stack_using_queue;


public class StackUsingQueue {
    public static void main(String[] args) {
        StaQu<Integer> stack = new StaQu<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();  // Output: [30, 20, 10]

        System.out.println("Top Element: " + stack.peek());  // Output: 30
        System.out.println("Popped Element: " + stack.pop()); // Output: 30

        stack.display();  // Output: [20, 10]
    }
}
