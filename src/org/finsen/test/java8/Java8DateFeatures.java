package org.finsen.test.java8;

import java.time.Clock;
import java.time.LocalDate;

/**
 * Created by f4v79v9 on 4/28/2015.
 */
public class Java8DateFeatures {

    public static void main(String[] args) {

        // Get the system clock as UTC offset
        final Clock clock = Clock.systemUTC();
        System.out.println( clock.instant() );
        System.out.println( clock.millis() );


        LocalDate d = LocalDate.now();
        System.out.println("d = " + d);
    }
}
