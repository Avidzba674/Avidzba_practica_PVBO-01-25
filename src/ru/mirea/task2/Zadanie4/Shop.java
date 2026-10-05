import java.util.ArrayList;
import java.util.Scanner;

class Computer {
    private String name;
    private String cpu;
    private int ram;
    private int price;

    public Computer(String name, String cpu, int ram, int price) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.price = price;
    }

    public String getName() { return name; }
    public String getCpu() { return cpu; }
    public int getRam() { return ram; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return "Computer{name='" + name + "', cpu='" + cpu +
                "', ram=" + ram + "GB, price=" + price + "}";
    }
}

public class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer c) {
        computers.add(c);
        System.out.println("Компьютер добавлен: " + c);
    }

    public void removeComputer(String name) {
        computers.removeIf(c -> c.getName().equalsIgnoreCase(name));
        System.out.println("Компьютер(ы) с именем '" + name + "' удалён(ы).");
    }

    public Computer findComputer(String name) {
        for (Computer c : computers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - добавить ПК, 2 - удалить ПК, 3 - найти ПК, 0 - выход");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.print("Название: ");
                    String name = sc.nextLine();
                    System.out.print("Процессор: ");
                    String cpu = sc.nextLine();
                    System.out.print("ОЗУ (ГБ): ");
                    int ram = sc.nextInt();
                    System.out.print("Цена: ");
                    int price = sc.nextInt();
                    shop.addComputer(new Computer(name, cpu, ram, price));
                    break;
                case 2:
                    System.out.print("Введите имя ПК для удаления: ");
                    shop.removeComputer(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Введите имя ПК для поиска: ");
                    Computer found = shop.findComputer(sc.nextLine());
                    System.out.println(found != null ? found : "Не найдено.");
                    break;
            }
        }
    }
}