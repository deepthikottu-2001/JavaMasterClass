package course.collectionpkg;

import course.mypackageB.Person;

import java.util.ArrayList;

public class ListSample {
    public static void main(String[] arg) {
        ArrayList<String> myList = new ArrayList();
        myList.add("Apple");
        myList.add("Orange");
        myList.add(1, "Grape");
        for (String fruit : myList) {
            System.out.println(fruit);


        }
    }
}
