package reflection_annotation.annotation.custom.log_execution_time;

public class ExecutionTime {
    @LogExecutionTime
    public void method1(){
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    @LogExecutionTime
    public void method2(){
        for (int i = 0; i < 1000; i++) {

        }
    }
}
