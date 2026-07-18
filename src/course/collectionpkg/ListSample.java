package course.collectionpkg;

import course.mypackageB.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ListSample {
    public static void main(String[] arg) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("c");
        myList.add("a");
        myList.add("z");
        myList.addFirst("i");
        myList.remove();
        for(String s : myList){
        System.out.println(s);

    }
    }}

