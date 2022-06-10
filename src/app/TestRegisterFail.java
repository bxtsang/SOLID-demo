package app;

import app.classes.NormalUser;
import app.classes.Registra;
import app.classes.User;

public class TestRegisterFail {
    public static void main(String[] args) {
        User user = new NormalUser("Bao Xian", "abcde@gmail.com", "cdE12345");
        System.out.println(user.toString());
        Registra.register(user);
    }
}
