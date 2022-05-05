package com.company;

public class Pizzeria {

    public static void main(String[] args) {

        // створюєм масив піц
        Pizza pizza[] = new Pizza[4];
        pizza[0] = new Pizza("Маргарита ", " Сыр, чери, перец болгарский", 130.55, 50.50);
        pizza[1] = new Pizza("Песто ", " Сыр, колбаски, бекон", 123.67, 10.0);
        pizza[2] = new Pizza("Четыре сыра ", " Сыр, сыр, сыр, сыр ", 130.0, 13.44);
        pizza[3] = new Pizza("Так себе ", "что-нибудь", 666.666, 13.13);

        // вивід інфи по піці
        for (int i = 0; i < pizza.length; i++) {
            System.out.println("Название пиццы: " + pizza[i].getName());
            System.out.println("Состав: " + pizza[i].getComposition());
            System.out.println("Стоимость: " + pizza[i].getCost());
            System.out.println("Особо важный параметр - радиус: " + pizza[i].getBasis().getRadius() * 2);
        }
    }
}
