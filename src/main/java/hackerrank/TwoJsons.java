package hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoJsons {

    public static void main(String[] args) {
        String json1 = "{\"one\":\"one\", \"two\":\"two\"}";
        String json2 = "{\"one\":\"one\",\"two\":\"two\"}";

        TwoJsons tj = new TwoJsons();
        List<String> keys = tj.compare(json1, json2);
        System.out.println(keys);
    }

    private List<String> compare(String json1, String json2) {
        Map<String, String> map1 = createMap(json1);
        return null;
    }

    private Map<String, String> createMap(String json) {
        json = json.replace("{", "");
        json = json.replace("}", "");
        json = json.replace("\"", "");
        String[] split = json.split(",");

        Map<String, String> map = new HashMap<>();
        for (String s : split) {
            String[] spl = s.split(":");
            map.put(spl[0], spl[1]);
        }
        return map;
    }

}

