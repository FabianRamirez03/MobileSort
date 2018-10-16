package com.example.ramir.mobilesort.Sort;

import com.example.ramir.mobilesort.Lists.SimpleList;
import com.example.ramir.mobilesort.Lists.GenericList;

import java.util.Random;

public class SortController {

    private int maxNum = 30;
    private static SortController instance;
    private SimpleList numList;
    private GenericList barsList;
    private int listSize;

    private SortController(int listSize){
        this.listSize = listSize;
        numList = new SimpleList();
        barsList = new GenericList();
        createNumList();
    }

    public static void init(int listSize){
        if (instance == null){
            instance = new SortController(listSize);
        }
    }

    private void createNumList(){
        int i;
        int n = listSize;
        for ( i = 0; i < n; i++){
            int j = new Random().nextInt(maxNum);
            numList.addAtEnd(j);
        }
    }

    public void unSortList(SimpleList list){
        int i;
        int n = list.getLarge()-1;
        for(i = 0; i < n; i++) {
            int j = new Random().nextInt(n);
            list.swap(i, j, list);
        }
    }

    public static SortController getInstance() {
        return instance;
    }

    public SimpleList getNumList() {
        return numList;
    }

    public void setNumListLen(int listSize) {
        this.listSize = listSize;
        numList = new SimpleList();
        createNumList();
    }

    public GenericList getBarsList() {
        return barsList;
    }

    public void setBarsList(GenericList barsList) {
        this.barsList = barsList;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }
}
