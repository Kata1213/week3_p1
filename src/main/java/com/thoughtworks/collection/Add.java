package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        //throw new NotImplementedException();
        int start=0;
        int end=0;
        if(leftBorder<=rightBorder){
            start=leftBorder;
            end=rightBorder;
        }else{
            start=rightBorder;
            end=leftBorder;
        }
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder)
    {
       // throw new NotImplementedException();
        int start=0;
        int end=0;
        if(leftBorder<=rightBorder){
            start=leftBorder;
            end=rightBorder;
        }else{
            start=rightBorder;
            end=leftBorder;
        }
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }


    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

        //throw new NotImplementedException();
        int sum=0;
        for (int i = 0; i <arrayList.size() ; i++) {
            sum+=3*arrayList.get(i)+2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        //throw new NotImplementedException();
        List<Integer> result=new ArrayList();
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i)%2==0){
                result.add(arrayList.get(i));
            }else{
                result.add(arrayList.get(i)*3+2);
            }

        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList)
    {
       // throw new NotImplementedException();
        //求数组中奇数元素的3倍加5的和
        int sum=0;
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i)%2!=0){
                sum+=arrayList.get(i)*3+5;
            }
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {

     //   throw new NotImplementedException();
        //求数组中所有偶数组成的数组的中位数
        List <Double>list=new ArrayList();
        for (int i = 0; i <arrayList.size() ; i++) {
            if(i%2==0){
                list.add(arrayList.get(i)+0.0);
            }
        }
        return list.get(list.size()/2);

    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {

        //throw new NotImplementedException();
        //求数组中所有偶数的平均数
        int count=0;
        int sum=0;
        for (int i = 0; i < arrayList.size(); i++) {
            if(i%2==0){
                sum+=arrayList.get(i);
                count++;
            }
        }
        return sum/count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        //throw new NotImplementedException();
        // 求数组中所有偶数组成的数组是否包含某特定的数specialElment
    if(specialElment%2!=0){
        return  false;
    }
        Collections.sort(arrayList);
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i)>specialElment){
                return false;
            }else if(specialElment==arrayList.get(i)){
                return true;
            }
        }
        return  false;


    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {

        //throw new NotImplementedException();
        //去除数组中所有偶数组成的数组的重复数
        List list=new ArrayList();
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i)%2==0){
                list.add(arrayList.get(i));
            }
        }
        List re=new ArrayList(new HashSet(list));
        return re;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList)
    {
    //    throw new NotImplementedException();
        //排序数组 结果使数组偶数在递增在前，奇数递减在后
        List odd=new ArrayList();
        List eve=new ArrayList();
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i)%2==0){
                eve.add(arrayList.get(i));
            }else{
                odd.add(arrayList.get(i));
            }

        }
        Collections.sort(odd);
        Collections.sort(eve);
        List re=new ArrayList();
        for (int i = 0; i <eve.size() ; i++) {
            re.add(eve.get(i));
        }
        for (int i = odd.size()-1; i>=0 ; i--) {
            re.add(odd.get(i));
        }
        return  re;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {

        //throw new NotImplementedException();
        // 数组中前一个元素和后一个元素的和的3倍的数组
        List <Integer> list=new ArrayList<>();
        for (int i = 0; i <arrayList.size()-1 ; i++) {
            list.add((arrayList.get(i)+arrayList.get(i+1))*3);
        }
        return list;
    }
}
