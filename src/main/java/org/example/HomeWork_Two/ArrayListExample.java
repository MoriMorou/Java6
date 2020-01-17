package org.example.HomeWork_Two;

import java.util.*;

/**
 * Существует две основные разновидности List:
 *  1. Базовый контейнер ArrayList, оптимизированный для произвольного доступа к элементам, но с относительно медленными
 *  операциями вставки/удаления элементов в середине списка.
 *  2. Контейнер LinkedList, оптимизированный для последовательного доступа, с быстрыми операциями вставки/удаления в
 *  середине списка. Произвольный доступ к элементам LinkedList выполняется относительно медленно, но по широте возможностей превосходит ArrayList.
 */


public class ArrayListExample {

    public static void main(String[] args) {

        /**
         * Если заранее известно, сколько элементов следует хранить, то перед заполнением массива вызовите метод
         * ensureCapacity():
         */

        ArrayList<Cat> cats = new ArrayList<>();
        cats.ensureCapacity(10);

        /**
         * add() - метод для добавления нового элемента. Новый элемент добавляется в конец списка.
         */
        Cat catF = new Cat("Филипп");
        cats.add(catF);

        cats.add(new Cat("Бегемот"));
        cats.add(new Cat("Соня"));
        cats.add(new Cat("Марк"));
        cats.add(new Cat("Аленка"));
        cats.add(new Cat("Аленка"));
        cats.add(2, new Cat("Рыжик"));

        /**
         * Существует метод indexOf(), который ищет подходящий элемент и выводит его индекс.
         */
        int filIndex = cats.indexOf(catF);
        System.out.println(filIndex);

        /**
         * get() - поиск элемента по индексу.
         */
        Cat secondCat = cats.get(2);
        System.out.println(secondCat);


        /**
         * Просмотр всех элементов через цикл
         */
        String catName = "";
        for(Cat cat : cats) {
            catName = catName + cat + " ";
        }
        System.out.println("All cats " + catName);

        /**
         * Чтобы узнать, есть в массиве какой-либо элемент, можно воспользоваться методом contains(),
         * который вернёт true или false:
         */

        System.out.println(catName.contains("Бобик") + " "+" - we don't have Bob");

        /**
         * remove() - удаление элемента
         * emoveIf() - удаление элемента по предикату (лень делать))))
         */

        cats.remove(0); // удаляем по индексу
        cats.remove("Рыжик"); // удаляем по объекту

        /**
         * set() - замена элемента
         */

        cats.set(1, new Cat("Пушок"));

        /**
         * toArray() - конвертируем в обычный массив
         */

        Cat[] newCats = cats.stream().toArray(Cat[]::new);
        System.out.println("Массив: " + Arrays.toString(newCats));


        /**
         * Сколько повторений
         */

        int count = Collections.frequency(cats, "Соня");
        System.out.println("We have Alenka " + count);

        /**
         * clear() - очистка массива (не стала делать)
         * removeAll()
         */

        /**
         * Сортировать элементы можно при помощи метода Collections.sort().
         */
        List<String> items = new ArrayList<>();

        items.add("d");
        items.add("c");
        items.add("b");
        items.add("a");

        Collections.sort(items);

        System.out.println(items.toString());

        /**
         * Интерфейс ListIterator - Позволяет проходить по всем элементам вперёд или назад. Для этого он проверяет,
         * есть ли следующий/предыдущий элемент после текущего.
         */


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator iterator = numbers.listIterator();

        System.out.println("Iterating in forward direction: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println("Iterating in backward direction: ");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }


}
