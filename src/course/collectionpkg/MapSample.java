package course.collectionpkg;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args){
        HashMap<String,String> myMap = new HashMap<>();
        myMap.put("CN","China");
        myMap.put("IN","India");
        myMap.put("US","United States");
        myMap.put("UK","United Kingdom");
        for(Map.Entry<String,String> map :myMap.entrySet()){
            System.out.println(map.getKey()+ ":" +map.getValue());
        }
    }
}
