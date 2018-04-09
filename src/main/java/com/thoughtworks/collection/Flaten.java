package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        //throw new NotImplementedException();
        List list = new ArrayList();
        int len=0;
        for(int i=0;i<array.length;i++){
            len+=array[i].length;
        }
       // int[] n=new int[len];
       // int index=0;
        for (int i = 0; i <array.length ; i++) {
            for(int j=0;j<array[i].length;j++){
               // n[index++]=array[i][j];
                list.add(array[i][j]);
            }
        }
        //list=Arrays.asList(n);
        return  list;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {

        //throw new NotImplementedException();
 // 把二维数组变成一维数组,消除重复,按照第一次出现的顺序排列最后的输出结果
        List list = new ArrayList();
        int len=0;
        for(int i=0;i<array.length;i++){
            len+=array[i].length;
        }
        LinkedHashSet <Integer>set = new LinkedHashSet();
        for (int i = 0; i <array.length ; i++) {
            for(int j=0;j<array[i].length;j++){
                set.add(array[i][j]);
            }
        }
        for (Integer integer : set) {
            list.add(integer);
        }
        return  list;
    }
}
