package com.example.ramir.mobilesort.Sort;

import com.example.ramir.mobilesort.Lists.SimpleList;
import java.util.Random;

public class SortController {

    private int maxNum = 30;
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

    private void unsortNums(SimpleList list){
        int i;
        int n = list.getLarge();
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

    public void setNumList(SimpleList numList) {
        this.numList = numList;
    }

    public SimpleList getBarsList() {
        return barsList;
    }

    public void setBarsList(SimpleList barsList) {
        this.barsList = barsList;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }
}
