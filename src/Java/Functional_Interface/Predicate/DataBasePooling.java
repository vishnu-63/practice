package Java.Functional_Interface.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Sort implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int a=(int)o1;
        int b=(int) o2;
        if(a>b) {
            return 1;
        } else if (a<b) {
            return -1;

        }
        else {
            return 0;
        }

    }
}

class DataBasePooling{
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5, 223, 65, 3, 3, 25, 5));
        Collections.sort(array, (Integer a,Integer b)->b-a);
        
    }

}