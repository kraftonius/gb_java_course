package seminar6;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {



//        //HashSet <- HashMap
//        //TreeSet <- TreeMap
//        //LinkedHashSet <- LinkedHashMap
//
//        Set<Integer> ints = new HashSet<>();
//
//        System.out.println(ints.add(1));
//        System.out.println(ints.add(2));
//        System.out.println(ints.add(1));
//        System.out.println(ints.add(1));
//        boolean contains = ints.contains(3);
//        System.out.println(contains);

        System.out.println(uniqueCount(List.of(1, 2, 2, 3, 4, 1, 1, 5, 10)));
    }

    static int uniqueCount(Collection<Integer> ints) {
        TreeSet<Integer> tSet = new TreeSet<>();
        TreeSet<Integer> rSet = new TreeSet<>();
        for (Integer x : ints
        ) {
            if (tSet.contains(x) && rSet.contains(x)) {
                tSet.remove(x);
            } else if (!rSet.contains(x)) {
                tSet.add(x);
                rSet.add(x);
            }
        }
        return tSet.size();
    }
}
