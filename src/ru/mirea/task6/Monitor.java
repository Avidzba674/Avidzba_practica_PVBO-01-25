package ru.mirea.task6;

public class Monitor implements Printable {
    private final String model;
    private final double diagonalInch;
    private final int refreshHz;

    public Monitor(String model, double diagonalInch, int refreshHz) {
        this.model = model;
        this.diagonalInch = diagonalInch;
        this.refreshHz = refreshHz;
    }

    public String getModel() { return model; }
    public double getDiagonalInch() { return diagonalInch; }
    public int getRefreshHz() { return refreshHz; }

    @Override
    public void print() {
        System.out.printf("Монитор: %s, %.1f\", %d Гц%n",
                model, diagonalInch, refreshHz);
    }

    @Override
    public String toString() {
        return model + " " + diagonalInch + "\" " + refreshHz + "Hz";
    }
}