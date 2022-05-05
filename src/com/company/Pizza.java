package com.company;

public class Pizza {

    // поля
    private double cost;
    private Circle basis;   // может ли бить тип Класс приватным и какова логика ()
    private String composition;
    private String name;

    // конструктор
    public Pizza(String name, String composition, double cost, double diameter) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        this.basis = new Circle(diameter / 2);
    }

    // геттери для подальшого доступу до полів
    public double getCost() {
        return cost;
    }

    public Circle getBasis() {
        return basis;
    }

    public String getComposition() {
        return composition;
    }

    public String getName() {
        return name;
    }
}
