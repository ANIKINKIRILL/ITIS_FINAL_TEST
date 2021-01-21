package task2.models;

/**
 * Response that we got from RestApi
 * This is gonna be server side response
 */

public class UserResponse {
    public String message;
    public int id;
    public String username;
    public int age;
    public long date_registered;
    public boolean isAdmin;

    public UserResponse(int id, String username, int age, long date_registered, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.date_registered = date_registered;
        this.isAdmin = isAdmin;
    }

    public UserResponse(String message, int id, String username, int age, long date_registered, boolean isAdmin) {
        this.message = message;
        this.id = id;
        this.username = username;
        this.age = age;
        this.date_registered = date_registered;
        this.isAdmin = isAdmin;
    }
}
