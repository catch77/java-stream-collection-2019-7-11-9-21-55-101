package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<=Math.abs(left-right); i++) {
            if (left > right) {
                list.add(left-i);
            }else {
                list.add(left+i);
            }
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        return getListByInterval(left, right).stream().filter(integer -> integer%2 == 0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toList());
        return list.stream().filter(ints -> ints%2 == 0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toList());
        return list.get(array.length-1);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
