package ru.mirea.task4.Zadanie1;

public enum Season {
    WINTER(-5.0) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10.0) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25.0) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8.0) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private final double avgTemperature;

    Season(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }

    // Базовое описание; переопределяется в константе SUMMER
    public String getDescription() {
        return "Холодное время года";
    }

    // Метод вывода "Я люблю ..." через switch
    public static void printLove(Season s) {
        switch (s) {
            case WINTER: System.out.println("Я люблю зиму");  break;
            case SPRING: System.out.println("Я люблю весну");  break;
            case SUMMER: System.out.println("Я люблю лето");   break;
            case AUTUMN: System.out.println("Я люблю осень");  break;
        }
    }
}