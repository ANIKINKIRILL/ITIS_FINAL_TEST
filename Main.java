package task2;

import task2.models.User;
import task2.models.UserResponse;
import task2.persistance.Database;
import task2.repository.Repository;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Repository repository = new Repository(database);
        // Get new user from server
        UserResponse newUserFromServer = new UserResponse(5, "Jura", 12, 1233, false);
        // Map this user to entity
        User userEntity = new User(newUserFromServer);
        System.out.println("Showing off: " + userEntity.showOff());
        System.out.println("Say hi: " + userEntity.sayHi());
        System.out.println("Initial list of users: " + repository.getAllUsers());
        // Add new user to database and test it
        long operationResult = -1;
        try {
            operationResult = repository.insertUser(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (operationResult == Constants.SUCCESS) {
            System.out.println("User was inserted...");
            System.out.println("New list of users: " + repository.getAllUsers());
        } else {
            System.out.println("Something went wrong...");
        }
        // Make user with id == 4 is admin
        User foundUser = repository
                .getAllUsers()
                .stream()
                .filter(user -> user.id == 4)
                .collect(Collectors.toList())
                .get(0);
        if (foundUser != null) {
            System.out.println("Is Dina Admin: " + foundUser.isUserAdmin());
        }

        long adminOperation = repository.makeUserByIdAdmin(4);

        if (adminOperation == Constants.SUCCESS) {
            System.out.println("User was updated...");
        } else {
            System.out.println("Something went wrong...");
        }

        if (foundUser != null) {
            System.out.println("Is now Dina Admin: " + foundUser.isUserAdmin());
        }
    }
}
