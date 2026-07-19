package course.collectionpkg;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapSample {
    public static void main(String[] args){
        Hashtable<String,String> myMap = new Hashtable<>();
        myMap.put("CN","China");
        myMap.put("IN","India");
        myMap.put("US","United States");
        myMap.put("UK","United Kingdom");
        myMap.remove("CN");
        for(Map.Entry<String,String> map :myMap.entrySet()){
            System.out.println(map.getKey()+ ":" +map.getValue());
        }
    }
}
