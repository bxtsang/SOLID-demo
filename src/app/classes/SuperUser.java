package app.classes;

public class SuperUser extends NormalUser {
    public SuperUser(String name, String email, String password) {
        super(name, email, password);
    }

    @Override
    public void performTask(TaskType taskType) {
        System.out.println("This is ok!");
    }
}
