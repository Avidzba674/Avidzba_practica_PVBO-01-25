package ru.mirea.task2.Zadanie1;

public class Author {
    private final String name; //const
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name; // ссылка на текущий объект
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override // указывает компилятору, что берет готовый метод от родительского класса
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}