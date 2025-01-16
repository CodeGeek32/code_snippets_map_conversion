package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

public class MapTraversingTest {

    @Test
    void mapTest() {
        Map<String, ClassA> map = new HashMap<>() {{
            put("alpha", ClassA.builder()
                    .aString("one")
                    .integer(1)
                    .aBoolean(true)
                    .build());
            put("betah", ClassA.builder()
                    .aString("two")
                    .integer(2)
                    .aBoolean(false)
                    .build());
            put("gammah", ClassA.builder()
                    .aString("three")
                    .integer(3)
                    .aBoolean(false)
                    .build());
            put("zetah", ClassA.builder()
                    .aString("four")
                    .integer(4)
                    .aBoolean(false)
                    .build());
        }};

        map.forEach((key, value) -> System.out.println("%s %s".formatted(key, value)));

        System.out.println(Arrays.toString(map.entrySet().toArray()));

        LinkedHashMap<String, ClassA> linkedHashMap = new LinkedHashMap<>() {{
            put("alpha", ClassA.builder()
                    .aString("one")
                    .integer(1)
                    .aBoolean(true)
                    .build());
            put("betah", ClassA.builder()
                    .aString("two")
                    .integer(2)
                    .aBoolean(false)
                    .build());
            put("gammah", ClassA.builder()
                    .aString("three")
                    .integer(3)
                    .aBoolean(false)
                    .build());
            put("zetah", ClassA.builder()
                    .aString("four")
                    .integer(4)
                    .aBoolean(false)
                    .build());
        }};

        System.out.println(Arrays.toString(linkedHashMap.entrySet().toArray()));

        // will iterate according to the "natural ordering" of the keys according to their compareTo() method (or an externally supplied Comparator)
        TreeMap<String, ClassA> treeMap = new TreeMap<>() {{
            put("alpha", ClassA.builder()
                    .aString("one")
                    .integer(1)
                    .aBoolean(true)
                    .build());
            put("betah", ClassA.builder()
                    .aString("two")
                    .integer(2)
                    .aBoolean(false)
                    .build());
            put("gammah", ClassA.builder()
                    .aString("three")
                    .integer(3)
                    .aBoolean(false)
                    .build());
            put("zetah", ClassA.builder()
                    .aString("four")
                    .integer(4)
                    .aBoolean(false)
                    .build());
            put("boo-ah", ClassA.builder()
                    .aString("five")
                    .integer(5)
                    .aBoolean(true)
                    .build());
        }};

        System.out.println(Arrays.toString(treeMap.entrySet().toArray()));

    }

}
