package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
       // throw new NotImplementedException();
        //选出给定区间中所有的数字
        List re=new ArrayList();
        if(left<right){
            for (int i = left; i <=right ; i++) {
                re.add(i);
            }
        }else{
            for (int i = left; i >=right ; i--) {
                re.add(i);
            }
        }
        return  re;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        //throw new NotImplementedException();
        //选出给定区间中所有的偶数
        List list=new ArrayList();
        if(left<right){
        for (int i = left; i <=right ; i++) {
            if(i%2==0){
                list.add(i);
            }
        }}else {
            for (int i = left; i >=right ; i--) {
                if(i%2==0){
                list.add(i);}
            }
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
       // throw new NotImplementedException();
        //选出给定区间中所有的偶数
        List list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                list.add(array[i]);
            }
        }
        return  list;
    }

    public int popLastElment(int[] array) {
       // throw new NotImplementedException();
        //弹出集合最后一个元素
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        //throw new NotImplementedException();
        //弹出两个集合的交集
        List re=new ArrayList();
        LinkedHashSet set=new LinkedHashSet();
        for (int i = 0; i <firstArray.length ; i++) {
            set.add(firstArray[i]);
        }
        for (int i = 0; i <secondArray.length ; i++) {
            if(set.contains(secondArray[i])){
                re.add(secondArray[i]);
            }
        }
        return re;


    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        //throw new NotImplementedException();
        // 将集合二中与集合一不同的元素加入集合一
        List re = new ArrayList();
        for (int i = 0; i <firstArray.length ; i++) {
            re.add(firstArray[i]);
        }
        LinkedHashSet set = new LinkedHashSet(re);
        for (int i = 0; i <secondArray.length ; i++) {
            if(set.contains(secondArray[i])){
                continue;
            }else{
                re.add(secondArray[i]);

            }
        }
        return  re;
    }
}
