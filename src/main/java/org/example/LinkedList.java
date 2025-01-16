package org.example;

public class LinkedList {
        public void linkedListExample() {
            java.util.LinkedList<String> lilst = new java.util.LinkedList<>();

            lilst.add("Red");
            lilst.add("Blue");
            lilst.add("Green");

            lilst.addFirst("Colors");

            for(String s : lilst) {
                System.out.println(s);
            }

    }
}
