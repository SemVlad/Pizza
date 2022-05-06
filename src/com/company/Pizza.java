/**
 * Класс, в котором описывается создание пиццы
 *
 * @author Семирозум Владимир
 */
package com.company;

public class Pizza {

    /**
     * Поля класса для создания пиццы
     *
     * @param cost - стоимость
     * @param basis - здесь хранится ссылка на класс, в котором создается геометрия (основа)
     * @param composition - состав
     * @param name - название
     */
    private double cost;
    private Circle basis;
    private String composition;
    private String name;

    /**
     * Конструктор класса, которы принимает входные данные для создания пиццы.
     * Также создается "геометрическая основа" для пиццы, для ее создания передаем в конструктор
     * класса Circle велечину радиуса.
     */
    public Pizza(String name, String composition, double cost, double diameter) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        this.basis = new Circle(diameter / 2);
    }

    /**
     * Блок методов, возращающие параметры
     */
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
