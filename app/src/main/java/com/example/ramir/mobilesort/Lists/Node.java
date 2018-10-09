package com.example.ramir.mobilesort.Lists;

public class Node {

    private int value;

    /**
     * Punteros
     */
    // Pointers
    Node next = null;


    /**
     * Sets a node to contain data
     *
     * @param value a type variable
     */
    public Node(int value) {
        this.value = value;
    }

    // @Overload
    public Node() {
    }


    /**
     * Setters and Getters
     **/
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }
}

