package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Привет!", "Я", "Олег");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // Пример как можно удалить всё с помощью итератора
        List<String> list1NotImmutable = new ArrayList<>();
        list1NotImmutable.add("Привет!");
        list1NotImmutable.add("Я");
        list1NotImmutable.add("Олег!");


        Iterator<String> iterator2 = list1NotImmutable.iterator();
        while (iterator2.hasNext()){
            iterator2.next();
            iterator2.remove();
        }
        System.out.println(list1NotImmutable);
    }
}