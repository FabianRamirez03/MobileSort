package com.example.ramir.mobilesort.Lists;

public class Node<T> {

    private T value = null;

    /**
     * Punteros
     */
    // Pointers
    Node next = null;
    Node right = null;
    Node left = null;
    Node top;
    Node bottom;
    Node top_right;
    Node top_left;
    Node bottom_right;
    Node bottom_left;

    /**
     * Estado de los punteros
     */
    //Pointers State
    private boolean nextState = false;
    private boolean rightState = false;
    private boolean leftState = false;
    private boolean topState = false;
    private boolean bottomState = false;
    private boolean top_rightState = false;
    private boolean top_leftState = false;
    private boolean bottom_rightState = false;
    private boolean bottom_leftState = false;


    /**
     * Almacena las lineas diagonales que se han realizado
     */
    private boolean LineTopRight = false;
    private boolean LineBottomRight = false;
    private boolean LineBottomLeft = false;
    private boolean LineTopLeft = false;


    /**
     * Sets a node to contain data
     *
     * @param value a type variable
     */
    public Node(T value) {
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

    public T getValue() {
        return value;
    }

    public Node getRight() {
        return right;
    }
}

