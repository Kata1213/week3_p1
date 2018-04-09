package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {

        //throw new NotImplementedException();
        List list = new ArrayList();
        while(true){
            int n = number - random.nextInt(3);
           // System.out.println(n);
            if(n>0){
                list.add(n);
                number=n;
            }else{
                break;
            }
        }
        return list;
    }
}
