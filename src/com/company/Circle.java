/**
 * В этом классе вычисляются некоторые величины окружности
 * по входным данным.
 * Результат вычислений выводится в консоль
 *
 * @author Семриозум Владимир
 */
package com.company;

public class Circle {

    /**
     * Поля класса
     *
     * @param color - цвет круга
     * @param circumference - длинна окржности
     * Остальные поля интуитивно понятны
     */
    private double radius;
    private double circumference;
    private double square;
    private String color;

    /**
     * Конструктор класса, который принимает один параметр
     *
     * @param radius - радиус круга
     * Вычисляются площадь круга и длинна окружности
     */
    public Circle(double radius) {
        this.radius = radius;
        circumference = Math.PI * 2 * radius;
        square = Math.PI * radius * radius * Math.PI;
    }

    /**
     * Конструктор класса, который принимает два параметра
     *
     * @param color  - цвет круга
     * @param radius - радиус круга
     */
    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    /**
     * Метод, который возращает параметр и в дальнейшем
     * дает доступ к нему
     *
     * @return radius - возращаемый параметр, значение радиуса круга
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Основной метод
     */
    public static void main(String[] args) {

        /**
         * Создание объектов с заданными параметрами,
         * которые передются в качестве аргументов конструктору
         */
        Circle circle1 = new Circle(10.0);
        Circle circle2 = new Circle("Blue", 11.0);

        /**
         * Вывод результата вычислений в консоль
         */
        System.out.printf("Площадь, см^2 = %.2f \n", circle1.square);
        System.out.printf("Окружность, см = %.2f \n", circle1.circumference);
        System.out.println("Цвет - " + circle2.color);
    }
}