package org.finsen.test.random.code;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by f4v79v9 on 4/28/2015.
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("1");ll.add("2");ll.add("3");ll.add("4");
        //Collections.sort(ll);
        System.out.println(ll);
    }
}
