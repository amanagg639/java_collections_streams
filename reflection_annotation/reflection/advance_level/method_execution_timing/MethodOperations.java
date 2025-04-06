package reflection_annotation.reflection.advance_level.method_execution_timing;

public class MethodOperations {
    public void method1(){
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public void method2(){
        for (int i = 0; i < 1000; i++) {

        }
    }
}
