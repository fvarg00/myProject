package org.finsen.test.java8;

import java.util.Arrays;

/**
 * Created by f4v79v9 on 4/28/2015.
 */
public class  Java8Features {

    public static void main(String[] args) {
        Arrays.asList("a", "b", "d").forEach( a -> System.out.println( a ) );

    }
}