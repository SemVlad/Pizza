package com.company;

public class Circle {

    // Поля
    private double radius;
    private double circumference;
    private double square;
    private String color;

    // Конструктора
    public Circle(double radius) {
        this.radius = radius;
        circumference = Math.PI * 2 * radius;
        square = Math.PI * radius * radius * Math.PI;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    // геттер для дальнейшего обращения к полю
    public double getRadius() {
        return radius;
    }

    // основной метод
    public static void main(String[] args) {

        // Экземпляры класса
        Circle circle1 = new Circle(10.0);
        Circle circle2 = new Circle("Blue", 11.0);

        // виводі
        System.out.printf("Площадь = %.2f \n", circle1.square);
        System.out.printf("Окружность = %.2f \n", circle1.circumference);
        System.out.println("Цвет - " + circle2.color);
    }
}