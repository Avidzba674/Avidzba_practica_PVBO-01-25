package ru.mirea.task4.Zadanie3;

public class User {
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean authenticate(String login, String password) {
        return this.login.equals(login) && this.password.equals(password); // используется для проверки, равен ли объект другому объекту
    }

    public String getLogin() { return login; }
}