package Week13;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,String> map = new java.util.HashMap<>();
        map.put("a","astronaut");
        map.put("b","builder");
        System.out.println(mapBully(map));
    }

    public static Map<String,String> mapBully(Map<String, String> map){
        if(!(map.get("a")==null)){
            map.put("b",map.get("a"));
            map.put("a","");
        }
        return map;
    }
    public static Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if(map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        return map;
    }
    public static Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab",map.get("a")+map.get("b"));
        }
        return map;
    }

}
