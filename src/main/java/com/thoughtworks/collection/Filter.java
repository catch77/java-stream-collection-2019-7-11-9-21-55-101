package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        return this.array.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return this.array.stream().filter(integer -> integer%3==0).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return firstList.stream().filter(integer -> secondList.contains(integer)).collect(Collectors.toList());
    }

    public List<Integer> getDifferentElements() {
        return this.array.stream().distinct().collect(Collectors.toList());
    }
}