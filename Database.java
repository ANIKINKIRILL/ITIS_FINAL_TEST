package task2.persistance;

import task2.Constants;
import task2.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Core Database class
 * This class is Dao for testing purposes
 */

public class Database implements Dao {

    ArrayList<User> users = new ArrayList<>();

    public Database() {
        users.add(new User(1, "Kirill", 18, 123412, false));
        users.add(new User(2, "Bob", 19, 12334212, true));
        users.add(new User(3, "Tana", 25, 1233412, false));
        users.add(new User(4, "Dina", 55, 12312412, false));
    }

    @Override
    public long insertUser(User user) throws Exception {
        try {
            users.add(user);
            return Constants.SUCCESS;
        } catch (Exception ex) {
            throw new Exception("User cannot be added due to bad id... with output: " + Constants.FAILURE);
        }
    }

    @Override
    public long makeUserByIdAdmin(int userId) {
        for (User user : users) {
            if (user.id == userId) {
                user.isAdmin = true;
                return Constants.SUCCESS;
            }
        }
        return Constants.FAILURE;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
