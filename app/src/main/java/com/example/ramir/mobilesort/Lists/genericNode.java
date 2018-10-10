package com.example.ramir.mobilesort.Lists;

public class genericNode<T> {

    private T value = null;
    private genericNode next = null;



    public genericNode(T value){
        this.value = value;
    }

    // @Overload
    public genericNode(){
    }



    public genericNode getNext() {
        return next;
    }

    public void setNext(genericNode next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}
