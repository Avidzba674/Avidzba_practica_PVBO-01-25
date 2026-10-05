package ru.mirea.task6;

public enum CpuBrand {
    INTEL("Intel"),
    AMD("AMD"),
    APPLE("Apple Silicon");

    private final String title;
    CpuBrand(String title) { this.title = title; }
    public String getTitle() { return title; }
}