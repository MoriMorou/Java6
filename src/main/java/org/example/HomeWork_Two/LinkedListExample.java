package org.example.HomeWork_Two;

import sun.rmi.runtime.Log;

import java.util.*;


/**
 * https://habr.com/ru/post/337558/ - Очень полезная статья (этот класс не успеваю нормально сделать, объявили посадку в самолет)
 */
public class LinkedListExample {

    public static void main(String[] args) {

        /** Используемый в примере итератор имеет ограниченные возможности, например, его метод add() добавляет новый элемент в конец списка. Чтобы иметь возможность вставлять в середину, используйте интерфейс ListIterator. Кроме того, в ListIterator имеются методы previous() и hasPrevious() для прохода по списку в обратном направлении.
         *Метод add() итератора вводит новый элемент до текущей позиции итератора. Например, в следующем примере пропускается первый элемент связного списка и вводится элемент "Пушок" перед вторым элементом.
        */

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Barsik");
        linkedList.add("Murzik");
        linkedList.add("Ryzhik");
        ListIterator<String> iterator = linkedList.listIterator();
        iterator.next(); // пропускаем первый элемент списка
        iterator.add("Pushok");
        System.out.println("Test = " + linkedList.toString());

        /**Также есть удобные методы addFirst(), addLast(), addAll().
         Получить объект можно через get(), getFirst(), getLast().
         Для изменения элемента используется метод set().
         Для удаления - remove() и clear().
         Метод contains() проверяет наличие конкретного элемента.
         На самом деле методов гораздо больше, изучайте документацию.
         Например, метод element() идентичен getFirst() и присутствует из-за принадлежности к интерфейсу Queue, который используется в LinkedList. А также есть метод peek(), который идентичен getFirst(), но не вызовет ошибку, если объект будет несуществующим, а просто вернёт null. А ещё есть метод peekFist(), который аналогичен peek(), но более понятен по названию.
         */
    }
}
