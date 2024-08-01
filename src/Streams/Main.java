package Streams;

import com.sun.jdi.IntegerType;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(2,12,4,8,10);
        Optional<Integer> res=array.stream().filter(val->val>3).findAny();
        System.out.println(res.get());
//        Integer[] res=array
//                .stream()
//                .filter((Integer val)->val>=3)
//                .toArray((int size)->new Integer[size]);
       // Optional<Integer> res=array.stream().reduce((Integer val1, Integer val2)->val1+val2);

    }

}
/*
List<String> array = Arrays.asList("1", "2", "4", "3", "2","9");
        IntStream intStream=array.stream().mapToInt((String  val)->Integer.parseInt(val));
        int[]  res=intStream.toArray();
        System.out.println(res);
 */