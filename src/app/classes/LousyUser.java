package app.classes;

public class LousyUser implements BadUser {
    private String name;
    private String email;
    private String password;

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
