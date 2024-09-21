package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortedHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1, "Sonu");
        names.put(2, "Monu");
        names.put(3, "Ronu");
        names.put(4, "Tonu");
        List<String> nameSorted = getValues(names);
        nameSorted.forEach(str -> System.out.println(str));
    }

    public static List<String> getValues(HashMap<Integer, String> names) {
        List<String> sortedNames = new ArrayList<>(names.values());
        Collections.sort(sortedNames);
        return sortedNames;
    }
}
