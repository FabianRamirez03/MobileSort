package com.example.ramir.mobilesort.Sort;
import com.example.ramir.mobilesort.Lists.*;
public class sortMethods {

    public static void bubbleSort(SimpleList list){
        int n = list.getLarge();
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                int x = list.getByIndex(j-1).getValue();
                int y = list.getByIndex(j).getValue();
                if(x > y){
                    //swap elements
                    list.swap(j-1, j, list);
                    int a = list.getByIndex(j-1).getValue();
                    int b = list.getByIndex(j).getValue();
                }

            }
        }
    }

}



