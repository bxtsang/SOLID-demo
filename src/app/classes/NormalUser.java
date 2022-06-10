package app.classes;

public class NormalUser implements User {
    private String name;
    private String email;
    private String password;

    public NormalUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public void performTask(TaskType taskType) {
        if (taskType == TaskType.Difficult) {
            System.out.println("I am struggling... \uD83D\uDE2D");
        } else {
            System.out.println("This is ok!");
        }
    }



    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public String getPassword() {
        return password;
    }
}
