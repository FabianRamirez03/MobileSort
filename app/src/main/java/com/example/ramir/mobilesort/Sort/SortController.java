package com.example.ramir.mobilesort.Sort;

import com.example.ramir.mobilesort.Lists.SimpleList;
import java.util.Random;

public class SortController {

    private static SortController instance;
    private SimpleList numList;
    private SimpleList barsList;
    private int listSize;

    private SortController(int listSize){
        this.listSize = listSize;
        numList = new SimpleList();
        barsList = new SimpleList();
        createNumList();
    }

    public static SortController init(int listSize){
        if (instance == null){
            instance = new SortController(listSize);
        }
        return instance;
    }

    private void createNumList(){
        int i;
        int n = listSize;
        for ( i = 0; i < n; i++){
            int j = new Random().nextInt(100);
            numList.addAtEnd(j);
        }
    }

    private void unsortNums(SimpleList list){
        int i;
        int n = list.getLarge();
        for(i = 0; i < n; i++) {
            int j = new Random().nextInt(n);
            list.swap(i, j, list);
        }
    }

    public SimpleList getNumList() {
        return numList;
    }

    public void setNumList(SimpleList numList) {
        this.numList = numList;
    }

    public SimpleList getBarsList() {
        return barsList;
    }

    public void setBarsList(SimpleList barsList) {
        this.barsList = barsList;
    }
}
