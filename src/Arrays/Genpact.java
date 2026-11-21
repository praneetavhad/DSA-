package Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Genpact {
    public static void main(String[] args) {
        System.out.println("Hello");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Praneet");
        map.put(2,"XYZ");

        map = new LinkedHashMap<>();

        final int i=1;
//        i = 2;

        System.out.println(map);

    }
}



