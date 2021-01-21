package task2.persistance;

import task2.models.User;

import java.util.List;

/**
 * Database access object
 * For accessing database and make some
 * operations with inserting, updating, querying and deleting
 */

public interface Dao {
    long insertUser(User user) throws Exception;
    long makeUserByIdAdmin(int userId);
    List<User> getAllUsers();
}
