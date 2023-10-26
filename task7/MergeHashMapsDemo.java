import java.util.HashMap;
import java.util.Map;

public class MergeHashMapsDemo {
    public static void main(String[] args) {
    Map<String,String> map1 = new HashMap<>();
    map1.put("apple", "red");
    map1.put("mango","yellow");
    map1.put("banana","yellow");
    
    Map<String,String> map2 = new HashMap<>(); 
    map2.put("grapes","green");
    map2.put("kiwi","green");
    map2.put("cherry","red");
    
    Map<String, String> mergedMap = new HashMap<>(map1);
    mergedMap.putAll(map2);
    System.out.println("merged map : "+mergedMap.entrySet());
    
    String searchElement = "Apple";
    for(Map.Entry<String,String> mergmap : mergedMap.entrySet()) {
    	if(mergmap.getKey().equalsIgnoreCase(searchElement)) {
    		System.out.println("\nsearch element value is : "+mergmap.getValue());
    	}
    	}
    }
}
