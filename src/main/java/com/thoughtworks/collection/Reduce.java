package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reduce implements SingleLink<Integer> {
    List<Integer> arrayList;

    @Override
    public Integer getHeaderData() {
        return this.arrayList.get(0);
    }

    @Override
    public Integer getTailData() {
        return this.arrayList.get(this.arrayList.size() - 1);
    }

    @Override
    public int size() {
        return this.arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.arrayList.isEmpty();
    }

    @Override
    public Integer getNode(int index) {
        return this.arrayList.get(index - 1);
    }

    @Override
    public boolean deleteFirst() {
        return this.arrayList.remove(this.getHeaderData());
    }

    @Override
    public boolean deleteLast() {
        return this.arrayList.remove(this.getTailData());
    }

    @Override
    public void addHeadPointer(Integer item) {
        this.arrayList.add(0, item);
    }

    @Override
    public void addTailPointer(Integer item) {
        this.arrayList.add(item);
    }

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return this.arrayList.stream().mapToInt(num -> num).max().orElse(0);
    }

    public double getMinimum() {
        return this.arrayList.stream().reduce((num1, num2) -> num1 < num2? num1: num2).orElse(0);
    }

    public double getAverage() {
        return (double)this.arrayList.stream().mapToInt(num -> num).sum() / this.arrayList.size();
    }

    public double getOrderedMedian() {
        List<Integer> sorted = this.arrayList.stream().sorted().collect(Collectors.toList());
        return sorted.size() % 2 == 0? (double)(sorted.get(sorted.size() / 2 - 1) + sorted.get(sorted.size() / 2)) / 2: sorted.get(sorted.size() / 2);
    }

    public int getFirstEven() {
        return this.arrayList.stream().filter(num -> num % 2 == 0).findFirst().orElse(0);
    }

    public int getIndexOfFirstEven() {
        return IntStream.range(0, this.arrayList.size()).filter(id -> this.arrayList.get(id) % 2 == 0).findFirst().orElse(0);
    }

    public boolean isEqual(List<Integer> arrayList) {
        return arrayList.size() == this.arrayList.size() && IntStream.range(0, arrayList.size()).filter(id -> arrayList.get(id).equals(this.arrayList.get(id))).count() == arrayList.size();
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        this.arrayList.stream().sorted().mapToInt(num -> num).forEach(singleLink::addTailPointer);
        return (double)((int)singleLink.getNode(this.arrayList.size() / 2) + (int)singleLink.getNode(this.arrayList.size() / 2 + 1)) / 2;
    }

    public int getLastOdd() {
        return this.arrayList.stream().filter(num -> num % 2 != 0).reduce(0, (num1, num2) -> num2);
    }

    public int getIndexOfLastOdd() {
        return IntStream.range(0, this.arrayList.size()).filter(id -> this.arrayList.get(id) % 2 != 0).reduce(0, (id1, id2) -> id2);
    }
}