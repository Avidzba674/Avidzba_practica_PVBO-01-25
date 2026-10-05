public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Иван Петров", "ivan@mail.ru", 'M');
        System.out.println(author);

        author.setEmail("newemail@mail.ru");
        System.out.println("После изменения email:");
        System.out.println(author);
        System.out.println("Имя: " + author.getName());
        System.out.println("Пол: " + author.getGender());
    }
}