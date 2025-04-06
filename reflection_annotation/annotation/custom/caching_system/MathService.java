package reflection_annotation.annotation.custom.caching_system;

public class MathService {
    @CacheResult
    public int expensiveComputation(int num){
        System.out.println("Computing for: " + num);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        return num*num;
    }
}
