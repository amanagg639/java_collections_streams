package reflection_annotation.annotation.custom.json_serialization;

public class User {
    @JsonField(name = "user-name")
    private String name;

    @JsonField(name = "age")
    private int age;

    @JsonField(name = "email")
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
