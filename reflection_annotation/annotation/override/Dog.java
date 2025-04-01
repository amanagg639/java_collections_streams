package reflection_annotation.annotation.override;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("This is dog class");
    }
}
