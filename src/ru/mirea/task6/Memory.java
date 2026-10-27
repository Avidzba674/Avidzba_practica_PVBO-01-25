package ru.mirea.task6;

public class Memory implements Printable { //класс берет на себя обязательство реализовать контракт
    private final String type;
    private final int sizeGB;
    private final int frequencyMHz;

    public Memory(String type, int sizeGB, int frequencyMHz) {
        this.type = type;
        this.sizeGB = sizeGB;
        this.frequencyMHz = frequencyMHz;
    }

    public String getType() { return type; }
    public int getSizeGB() { return sizeGB; }
    public int getFrequencyMHz() { return frequencyMHz; }

    @Override
    public void print() {
        System.out.printf("Память: %s, %d ГБ, %d МГц%n", type, sizeGB, frequencyMHz);
    }

    @Override
    public String toString() {
        return type + " " + sizeGB + "GB " + frequencyMHz + "MHz";
    }
}