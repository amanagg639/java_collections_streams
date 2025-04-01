package reflection_annotation.annotation.custom.todo;

public class Assignment {
    @Todo(task = "Login-Page", assignedTo = "Aman", priority = "low")
    public void task1(){
        System.out.println("this is task 1");
    }
    @Todo(task = "Home Page", assignedTo = "rahul", priority = "High")
    public void task2(){
        System.out.println("this is task 2");
    }
    @Todo(task = "Connection", assignedTo = "Vanshika")
    public void task3(){
        System.out.println("this is task 3");
    }
}
