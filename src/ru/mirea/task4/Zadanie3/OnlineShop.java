package ru.mirea.task4.Zadanie3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShop {
    private final List<Product> catalog = new ArrayList<>();
    private final Cart cart = new Cart();
    private final User user = new User("admin", "1234");

    public OnlineShop() {
        catalog.add(new Product("Смартфон",    Category.ELECTRONICS, 34990));
        catalog.add(new Product("Ноутбук",     Category.ELECTRONICS, 72990));
        catalog.add(new Product("Футболка",    Category.CLOTHES,       1290));
        catalog.add(new Product("Джинсы",      Category.CLOTHES,       3590));
        catalog.add(new Product("Java. Книга", Category.BOOKS,         2100));
        catalog.add(new Product("Хлеб",        Category.FOOD,            45));
        catalog.add(new Product("Молоко",      Category.FOOD,            89));
    }

    public boolean login(Scanner sc) {
        System.out.println("=== Аутентификация ===");
        System.out.print("Логин: ");   String login = sc.nextLine();
        System.out.print("Пароль: ");  String pass  = sc.nextLine();
        if (user.authenticate(login, pass)) {
            System.out.println("Добро пожаловать, " + user.getLogin() + "!");
            return true;
        }
        System.out.println("Неверный логин или пароль.");
        return false;
    }

    public void showCategories() {
        System.out.println("\n=== Каталоги ===");
        for (Category c : Category.values()) {
            System.out.println("- " + c.getTitle());
        }
    }

    public void showProductsByCategory(Scanner sc) {
        showCategories();
        System.out.print("Выберите категорию: ");
        String input = sc.nextLine().trim();

        Category chosen = null;
        for (Category c : Category.values()) {
            if (c.getTitle().equalsIgnoreCase(input) || c.name().equalsIgnoreCase(input)) {
                chosen = c;
                break;
            }
        }
        if (chosen == null) {
            System.out.println("Категория не найдена.");
            return;
        }

        System.out.println("\nТовары в категории «" + chosen.getTitle() + "»:");
        for (Product p : catalog) {
            if (p.getCategory() == chosen) System.out.println(p);
        }
    }

    public void addToCartByName(Scanner sc) {
        System.out.print("\nВведите название товара: ");
        String name = sc.nextLine().trim();
        for (Product p : catalog) {
            if (p.getName().equalsIgnoreCase(name)) {
                cart.add(p);
                return;
            }
        }
        System.out.println("Товар не найден.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OnlineShop shop = new OnlineShop();

        if (!shop.login(sc)) return; // без авторизации дальше не пускаем

        while (true) {
            System.out.println("\n--- Меню ---");
            System.out.println("1 - каталоги");
            System.out.println("2 - товары категории");
            System.out.println("3 - добавить товар в корзину");
            System.out.println("4 - купить товары из корзины");
            System.out.println("0 - выход");
            System.out.print("Выбор: ");

            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1": shop.showCategories(); break;
                case "2": shop.showProductsByCategory(sc); break;
                case "3": shop.addToCartByName(sc); break;
                case "4": shop.cart.checkout(); break;
                case "0":
                    System.out.println("Выход.");
                    sc.close();
                    return;
                default:
                    System.out.println("Неизвестная команда.");
            }
        }
    }
}