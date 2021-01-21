package task2.repository;

import task2.models.User;
import task2.persistance.Dao;

import java.util.List;

/**
 * Repository is a HUB for
 * defining the business logic in application
 *
 * This class contains 3 main methods that has
 * Database Access Object class for making database
 * transactions
 */

public class Repository {

    private Dao dao;

    public Repository(Dao dao) {
        this.dao = dao;
    }

    /**
     * This function makes user admin
     *
     * @param userId    which user to make admin
     * @return          result of success or failure message
     */

    public long makeUserByIdAdmin(int userId) {
        return dao.makeUserByIdAdmin(userId);
    }

    /**
     * This function inserts new user
     * to database
     *
     * @param user    which user to be inserted
     * @return          result of success or failure message
     */

    public long insertUser(User user) throws Exception {
        return dao.insertUser(user);
    }

    /**
     * This function returns all users
     * in database
     *
     * @return          list of users
     */

    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }
}
