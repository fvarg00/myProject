package org.finsen.test.java8;

import java.util.Optional;

/**
 * Created by f4v79v9 on 4/28/2015.
 */
public class OptionalsJava8 {

    public static void main(String[] args) {
        Optional< String > fullName = Optional.ofNullable(null);

        System.out.println( "Full Name is set? " + fullName.isPresent() );

        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );

        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );

    }
}
