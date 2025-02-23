import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String []args){
        Map<String,Integer> myMap = new HashMap<String,Integer>();
        Map<String,Integer> myMap1 = new HashMap<String,Integer>();
        myMap.put("Key1",1);
        myMap.put("Key2",2);
        myMap.put("Key3",3);
        myMap.put("Key4",4);
        myMap.getOrDefault("Key",-1);
        System.out.println(myMap.get("Key1"));
        System.out.println(myMap.containsKey("Key3"));
        System.out.println(myMap.get("key5"));
        myMap.forEach((key,value) -> System.out.println("Key : "+ key +" :: Value : "+ value));
    }
}
