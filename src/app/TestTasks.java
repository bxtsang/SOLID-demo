package app;

import app.classes.NormalUser;
import app.classes.SuperUser;
import app.classes.TaskType;
import app.classes.User;

public class TestTasks {
    public static void main(String[] args) {
        User normalUser = new NormalUser("Bao Xian", "abcde@gmail.com", "@bcdE12345");

        System.out.println("Trying tasks for normal user...");

        System.out.println("performing normal task...");
        normalUser.performTask(TaskType.Simple);

        System.out.println("performing difficult task...");

        normalUser.performTask(TaskType.Difficult);

        System.out.println();
        // add your code here to test for super users
        User superUser = new SuperUser("Bao Xian", "abcde@gmail.com", "@bcdE12345");

        System.out.println("Trying tasks for super user...");

        System.out.println("performing normal task...");
        superUser.performTask(TaskType.Simple);

        System.out.println("performing difficult task...");

        superUser.performTask(TaskType.Difficult);



        // add your code here to test for the last kind of users


    }
}
