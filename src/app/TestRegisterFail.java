package app;

import app.classes.User;

public class TestRegisterFail {
    public static void main(String[] args) {
        User user = new User("Bao Xian", "abcde@gmail.com", "cdE12345", false);
        System.out.println(user.toString());
        user.registerUser();
    }
}
