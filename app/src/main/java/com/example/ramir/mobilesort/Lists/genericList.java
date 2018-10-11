package com.example.ramir.mobilesort.Lists;

public class genericList<T> {
    private genericNode<T> first;
    private int large;

    public genericList(){
        this.first = null;
        this.large = 0;
    }

    /**
     * Agrega el elemento al final de la lista
     * @param value elemento a agregar
     */
    public void addAtEnd(T value){
        if(this.isEmpty()){
            this.first = new genericNode<>(value);
            this.large += 1;
        }
        else{
            genericNode temporal = this.first;
            while (temporal.getNext() != null){
                temporal =  temporal.getNext();
            }
            temporal.setNext(new genericNode(value));
            this.large += 1;
        }
    }

    /**
     * Agrega elemento al inicio de la lista
     * @param value elemento a agregar
     */
    public void addAtBeginning (T value){
        if(this.isEmpty()){
            this.first = new genericNode<>(value);
            this.large += 1;
        }
        else{
            genericNode tmp = new genericNode<>(value);
            tmp.setNext(this.first);
            this.first = tmp;
        }
    }

    /**
     * Verifica si la lista está vacía
     * @return boolean
     */
    public boolean isEmpty(){
        genericNode next = this.getFirst();
        return next == null;
    }

    /**
     * Obtiene el primer elemento de la lista
     * @return primer elemento de la lista
     */
    public genericNode<T> getFirst() {
        return first;
    }

    /**
     * Imprime el largo de la lista
     */
    public void showLarge() {
        System.out.println(this.getLarge());
    }

    /**
     * Obtiene el largo de la lista
     * @return int que significa el largo de la lista
     */
    public int getLarge() {
        return large;
    }

    /**
     * Limpia la lista por completo
     */
    public void clearOut(){
        this.first = null;
    }

    /**
     * Imprime los elementos de la lista
     */
    public void showList(){
        genericNode temporal = this.first;
        while (temporal != null){
            System.out.println(temporal.getValue());
            temporal = temporal.getNext();
        }
    }

    /**
     * Elimina un elemento en la posición que se le indique
     * @param index posición de elemento a eliminar
     */
    public void delete(int index){
        if (index < this.getLarge()){
            int i = 0;
            genericNode temporal = this.first;
            if (index == 0){
                this.first = this.getByIndex(1);
            }
            else {
                while (temporal.getNext() != null) {

                    if (i == index) {
                        temporal.setNext(temporal.getNext().getNext());
                        this.large -= 1;
                        break;
                    } else {
                        temporal = temporal.getNext();
                    }
                    i += 1;
                }
            }
        }
        else{
            System.out.println("List out of index");
        }
    }

    /**
     * Obtiene el elemento que se encuentra en un determinado índice
     * @param i posición de elemento a obtener
     * @return un elemento de la lista
     */
    public genericNode<T> getByIndex(int i){
        int j = 0;
        genericNode temp = this.getFirst();
        while (j != i){
            temp = temp.getNext();
            j++;
        }
        return temp;
    }

    public void swap2 (int i, int j, SimpleList list){
        Node node1 = list.getByIndex(i);
        Node node2 = list.getByIndex(j);

        int tmp = node1.getValue();
        node1.setValue(node2.getValue());
        node2.setValue(tmp);
    }

}
