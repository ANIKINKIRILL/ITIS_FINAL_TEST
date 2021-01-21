package task2.models;

public class Admin extends BaseUser {

    public Admin(int id, String username, int age, long date_registered, boolean isAdmin) {
        super(id, username, age, date_registered, isAdmin);
    }

    @Override
    public String sayHi() {
        return "Admin here! I am a Bossss...";
    }

    @Override
    boolean isUserAdmin() {
        return true;
    }
}
