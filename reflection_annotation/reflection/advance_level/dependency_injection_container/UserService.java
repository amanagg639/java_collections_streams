package reflection_annotation.reflection.advance_level.dependency_injection_container;

public class UserService {
    @Inject
    private DatabaseService dbService;

    public void performAction(){
        dbService.connect();
        System.out.println("performing user action...");
    }
}
