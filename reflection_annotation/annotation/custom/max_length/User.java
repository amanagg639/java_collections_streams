package reflection_annotation.annotation.custom.max_length;

public class User {
    @MaxLength(value = 8)
    public  String userName;

    User(String userName) throws NoSuchFieldException {
        MaxLength len = (MaxLength) User.class.getField("userName").getAnnotation(MaxLength.class);
        if(userName.length()>len.value()){
            throw new IllegalArgumentException("length limit is exceeded");
        }
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
