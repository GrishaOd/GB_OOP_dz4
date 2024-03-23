package HomeWork;

public class Program {
    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange = new Orange();

        appleBox1.addFruit(apple1);
        appleBox1.addFruit(apple2);
        orangeBox.addFruit(orange);

        System.out.println("Вес коробки appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес коробки orangeBox: " + orangeBox.getWeight());

        System.out.println("Равен ли вес appleBox1 и appleBox2 ? " + appleBox1.compare(appleBox2));
        System.out.println("Равен ли вес appleBox1 и orangeBox ? " + appleBox1.compare(orangeBox));

        appleBox1.transferFruits(appleBox2);

        System.out.println("После пересыпания:");
        System.out.println("Вес коробки appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес коробки appleBox2: " + appleBox2.getWeight());
    }
}
