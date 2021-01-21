package task2.models;

public class User extends BaseUser {

    public User(int id, String username, int age, long date_registered, boolean isAdmin) {
        super(id, username, age, date_registered, isAdmin);
    }

    public User(UserResponse userResponse) {
        this.id = userResponse.id;
        this.username = userResponse.username;
        this.age = userResponse.age;
        this.date_registered = userResponse.date_registered;
        this.isAdmin = userResponse.isAdmin;
    }

    @Override
    public String sayHi() {
        return "Default user, but it's fine :)";
    }

    @Override
    public boolean isUserAdmin() {
        return isAdmin;
    }
}
