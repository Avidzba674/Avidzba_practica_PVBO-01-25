package ru.mirea.task2.Zadanie5;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', age=" + getAge() +
                ", humanAge=" + getHumanAge() + "}";
    }
}

class DogKennel {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Бобик", 3);
        dogs[1] = new Dog("Шарик", 5);
        dogs[2] = new Dog("Рекс", 2);

        for (Dog d : dogs) {
            System.out.println(d);
        }
    }
}