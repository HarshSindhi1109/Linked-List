package org.example;

import java.util.*;

public class Iterator {
    public void printList(List<String> lst) {
        ListIterator<String> data = lst.listIterator();
        while(data.hasNext()) {
            System.out.println(data.next());
        }
    }
    public Iterator() {
        List<String> lilst = new ArrayList<>();

        lilst.add("Red");
        lilst.add("Blue");
        lilst.add("Green");
        lilst.add("Pink");
        lilst.add("Yellow");
        lilst.add("Orange");
        lilst.add("Black");
        lilst.add("White");

        lilst.sort(null);
        System.out.println(lilst);

        Collections.reverse(lilst);
        System.out.println(lilst);
    }
}

