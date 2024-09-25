package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.cleanUsersTable();
        userService.saveUser("Igor", "Petrow",(byte)45);
        userService.saveUser("Kolya", "Iwanow",(byte)45);
        userService.saveUser("Ingiborga", "Sidorowa",(byte)45);
        userService.saveUser("Nikita", "Kolesow",(byte)45);
         List<User> users = userService.getAllUsers();

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

    }
}
