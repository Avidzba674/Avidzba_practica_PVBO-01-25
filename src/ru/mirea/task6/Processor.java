package ru.mirea.task6;

public class Processor implements Printable {
    private final CpuBrand brand;
    private final String model;
    private final double frequencyGHz;
    private final int cores;

    public Processor(CpuBrand brand, String model, double frequencyGHz, int cores) {
        this.brand = brand;
        this.model = model;
        this.frequencyGHz = frequencyGHz;
        this.cores = cores;
    }

    public CpuBrand getBrand() { return brand; }
    public String getModel() { return model; }
    public double getFrequencyGHz() { return frequencyGHz; }
    public int getCores() { return cores; }

    @Override
    public void print() {
        System.out.printf("Процессор: %s %s, %.2f ГГц, %d ядер%n",
                brand.getTitle(), model, frequencyGHz, cores);
    }

    @Override
    public String toString() {
        return brand.getTitle() + " " + model + " @" + frequencyGHz + "GHz x" + cores;
    }
}