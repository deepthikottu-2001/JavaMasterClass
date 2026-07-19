package course.collectionpkg;

import java.util.Collection;
import java.util.HashSet;

public class SetSample {
    public static void main(String[] args){
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("Grape");
        mySet.add("Orange");
        mySet.add("Grape");
        for(String fruit : mySet){
           System.out.println(fruit);
        }

    HashSet<String> newSet = new HashSet<>(mySet);
        newSet.add("Watermelon");
        for(String fruit : newSet){
            System.out.println(fruit);
        }

    }}

