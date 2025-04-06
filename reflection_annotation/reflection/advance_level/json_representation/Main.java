package reflection_annotation.reflection.advance_level.json_representation;

public class Main {
    public static void main(String[] args) throws Exception{
        User user = new User("aman", 22, "aman@gamil.com");
        String json = JSONRepresentation.convertIntoJSON(user);
        System.out.println(json);
    }
}
