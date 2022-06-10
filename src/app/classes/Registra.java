package app.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registra {
    public static void register(User user) {

        if (!isValid(user)) {
            System.out.println("User invalid, did not register");
            return;
        }

        // some code to add to database
        System.out.println("Registered user with name: " + user.getName());

        // send an email to welcome user
        sendEmail(user);
    }

    public static boolean isValid(User user) {
        // check if email is valid
        // valid email should have "@"
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)$");
        Matcher emailMatcher = emailPattern.matcher(user.getEmail());

        if (!emailMatcher.matches()) {
            System.out.println("Email is not valid!");
            return false;
        }

        // check if password is valid
        // password should have a digit (?=.*[0-9])
        // password should have a lowercase character (?=.*[a-z])
        // password should have a uppercase character (?=.*[A-Z])
        // password should have a special character (?=.*[!@#&()–[{}]:;',?/*~$^+=<>])
        // password should be between 8 and 20 characters .{8,20}
        Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        Matcher passwordMatcher = passwordPattern.matcher(user.getPassword());

        if (!passwordMatcher.matches()) {
            System.out.println("Password is not valid!");
            return false;
        }

        return true;
    }

    public static void sendEmail(User user) {
        String message = "Hello " + user.getName() + ", welcome to this app!";
        //some code to send the email
        System.out.println("Sent email with message: " + message);
    }
}
