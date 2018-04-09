package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {

        //throw new NotImplementedException();
        return array.stream()
                .map(num -> num * 3)
                .collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return this.array.stream().map(num -> letters[num - 1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
      //  throw new NotImplementedException();
        return this.array.stream()
                .map(num -> (num > 26? letterList.get((num - 1) / 26 - 1): "") + letterList.get((num - 1) % 26))
                .collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        //throw new NotImplementedException();
        return this.array.stream().sorted((num1, num2) -> num2 - num1).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
      //  throw new NotImplementedException();
        return this.array.stream().sorted().collect(Collectors.toList());
    }
}
