import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapDS {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Four", 4);

        System.out.println("Map: "+numbers);
        System.out.println("Keys: "+numbers.keySet());
        System.out.println("Values: "+numbers.values());
        System.out.println("Entries: "+numbers.entrySet());
        
    }
}
