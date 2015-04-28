package org.finsen.test.java8;

/**
 * Created by f4v79v9 on 4/28/2015.
 */
public interface DefaultInterface {

    default String notRequired(){
        return "Default Implementation";
    }

}
