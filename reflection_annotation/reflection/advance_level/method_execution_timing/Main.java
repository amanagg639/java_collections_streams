package reflection_annotation.reflection.advance_level.method_execution_timing;

public class Main {
    public static void main(String[] args) {
        MethodOperations operations = new MethodOperations();
        double result1 = ExecutionTime.findExecutionTime(operations, "method1");
        System.out.println("Execution Time of this method is: " + result1);

        double result2 = ExecutionTime.findExecutionTime(operations, "method2");
        System.out.println("Execution Time of this method is: " + result2);

    }
}
