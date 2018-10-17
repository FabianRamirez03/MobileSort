package com.example.ramir.mobilesort.Lists;

public class GenericNode<T> {

    private T value = null;
    private GenericNode next = null;



    public GenericNode(T value){
        this.value = value;
    }

    // @Overload
    public GenericNode(){
    }



    public GenericNode getNext() {
        return next;
    }

    public void setNext(GenericNode next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
