package reflection_annotation.reflection.advance_level.dependency_injection_container;

public class Main {
    public static void main(String[] args) throws Exception{
        DIContainer container = new DIContainer();
        UserService userService = container.getInstance(UserService.class);

        userService.performAction();
    }
}
