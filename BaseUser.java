package task2.models;

import task2.interfaces.Greeting;
import task2.interfaces.Showable;

public abstract class BaseUser implements Greeting, Showable {

    public int id;
    public String username;
    public int age;
    public long date_registered;
    public boolean isAdmin;

    public BaseUser(int id, String username, int age, long date_registered, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.date_registered = date_registered;
        this.isAdmin = isAdmin;
    }

    public BaseUser() {}

    @Override
    public String sayHi() {
        return "Hey! My name is " + username;
    }

    @Override
    public String showOff() {
        if (isAdmin) {
            return "Hahaha I am Admin, you are not!";
        } else {
            return "I am not Admin. I am default user. Why?";
        }
    }

    abstract boolean isUserAdmin();

    @Override
    public String toString() {
        return username;
    }
}
