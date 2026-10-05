package ru.mirea.task6;

public class OnlineComputerShop {
    public static void main(String[] args) {
        // Составные части
        Processor i7  = new Processor(CpuBrand.INTEL, "Core i7-13700K", 3.4, 16);
        Processor m2  = new Processor(CpuBrand.APPLE, "M2 Pro",          3.5, 12);
        Memory    ddr5 = new Memory("DDR5", 32, 5600);
        Memory    ddr4 = new Memory("DDR4", 16, 3200);
        Monitor   mon1 = new Monitor("Dell U2723QE", 27.0, 60);
        Monitor   mon2 = new Monitor("LG UltraGear",  32.0, 144);

        // Компьютеры
        Computer c1 = new Computer("Gaming PC",  i7, ddr5, mon2, 189990);
        Computer c2 = new Computer("Mac Mini",   m2, ddr4, mon1, 129990);

        // Магазин
        Shop shop = new Shop("DNS-Online");
        shop.addComputer(c1);
        shop.addComputer(c2);

        // 1. Обход массива Printable и вызов print() для каждого
        Printable[] printables = {
                i7, ddr5, mon1,        // составные части
                c1, c2,                // компьютеры
                shop                   // сам магазин
        };

        for (Printable p : printables) {
            p.print();
        }

        // 2. Дополнительная аналитика магазина
        System.out.println("--- Аналитика ---");
        Computer cheapest = shop.findCheapest();
        Computer priciest = shop.findMostExpensive();
        if (cheapest != null) System.out.println("Самый дешёвый: " + cheapest);
        if (priciest != null) System.out.println("Самый дорогой: " + priciest);
    }
}