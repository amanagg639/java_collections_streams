package reflection_annotation.reflection.advance_level.custom_logging_proxy;

public class GreetingImpl implements Greeting{
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
