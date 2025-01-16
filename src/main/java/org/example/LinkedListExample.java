package org.example;
import java.util.LinkedList;

public class LinkedListExample {
        public void linkedListExample() {
            LinkedList<String> lilst = new LinkedList<>();

            lilst.add("Red");
            lilst.add("Blue");
            lilst.add("Green");

            lilst.addFirst("Colors");

            for(String s : lilst) {
                System.out.println(s);
            }
    }
}
