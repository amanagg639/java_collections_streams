package reflection_annotation.annotation.custom.mark_improtant;

public class MethodsLevel {
//    public void
    @ImportantMethod(level = "low")
    public void method1(){
        System.out.println("method 1");
    }
    @ImportantMethod(level = "Mid")
    public void method2(){
        System.out.println("method 2");
    }
}
