package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    protected static String[] data = {
            "GKFFD",
            "TNANA",
            "MPMSL",
            "PSWME",
            "LZMLF",
            "JYEBV",
            "YELNT",
            "JSNKR",
            "JFESF",
            "TMJLL"
    };

    public static List<String> createArrayList() {
       return new ArrayList<>(Arrays.asList(data));
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (String s: customList){
            System.out.println(customList.indexOf(s) + ": " + s);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        // Objetivo 1
        List<String> l = createArrayList();

        // Objetivo 2
        addElementToList(l, "AAA");

        // Objetivo 3
        printElementsAndIndex(l);
    }


}
