package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven()
    {
      //  throw new NotImplementedException();
        //求数组中的偶数
        List list = new ArrayList();
        for (int i = 0; i <array.size() ; i++) {
            if(array.get(i)%2==0){
                list.add(array.get(i));
            }

        }
        return  list;
    }

    public List<Integer> filterMultipleOfThree() {

        //throw new NotImplementedException();
        //求数组中3的倍数
       List list=new ArrayList();
        for (int i = 0; i <array.size() ; i++) {
            if(array.get(i)%3==0){
                list.add(array.get(i));
            }
        }
        return  list;
    }



    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        //throw new NotImplementedException();
        //求两数组的公共元素
        List list = new ArrayList();
        LinkedHashSet set=new LinkedHashSet(secondList);
        for (int i = 0; i <firstList.size() ; i++) {
            if(set.contains(firstList.get(i))){
                list.add(firstList.get(i));
            }
        }
        return  list;
    }

    public List<Integer> getDifferentElements() {
        //throw new NotImplementedException();
        //去除数组中的重复元素
        return  new ArrayList(new LinkedHashSet(array));
    }
}