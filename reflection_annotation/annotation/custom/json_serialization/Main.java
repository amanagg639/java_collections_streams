package reflection_annotation.annotation.custom.json_serialization;

public class Main {
    public static void main(String[] args) {
        User user = new User("Aman", 21, "aman@gmail.com");
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
