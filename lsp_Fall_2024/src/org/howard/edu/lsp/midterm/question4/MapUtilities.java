import java.util.HashMap;
import java.util.Map;

/**
 * Utility class for operations on Maps.
 */
public class MapUtilities {

    /**
     * Returns the number of common key/value pairs between two HashMaps.
     * If either map is empty or null, returns 0.
     *
     * @param map1 the first HashMap<String, String>
     * @param map2 the second HashMap<String, String>
     * @return the number of common key/value pairs
     */
    public static int commonKeyValuePairs(
        HashMap<String, String> map1,
        HashMap<String, String> map2){

        // Check if either map is null or empty
        if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int count = 0;

        // Iterate over entries of map1
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            // Check if map2 contains the same key and the same value
            if (map2.containsKey(key) && value.equals(map2.get(key))) {
                count++;
            }
        }

        return count;
    }
}
