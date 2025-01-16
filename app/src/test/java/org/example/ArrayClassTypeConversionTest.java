package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ArrayClassTypeConversionTest {
    @Test
    void test() {
        var arrayListA = new ArrayList<ClassA>() {{
            add(ClassA.builder()
                    .aString("one")
                    .integer(1)
                    .aBoolean(true)
                    .build());
            add(ClassA.builder()
                    .aString("two")
                    .integer(2)
                    .aBoolean(false)
                    .build());
            add(ClassA.builder()
                    .aString("three")
                    .integer(3)
                    .aBoolean(false)
                    .build()
            );
        }};

        var arrayListB = arrayListA.stream()
                .map(ArrayClassTypeConversionTest::convert)
                .toList();

        var arrayListC = arrayListA.stream()
                .map((classA) -> ClassB.builder()
                        .integer(classA.integer)
                        .aBoolean(classA.aBoolean)
                        .build()
                )
                .toList();


        System.out.println(Arrays.toString(arrayListA.toArray()));
        System.out.println(Arrays.toString(arrayListB.toArray()));
        System.out.println(Arrays.toString(arrayListC.toArray()));
    }

    static ClassB convert(ClassA classA) {
        return ClassB.builder()
                .integer(classA.integer)
                .aBoolean(classA.aBoolean)
                .build();
    }
}
