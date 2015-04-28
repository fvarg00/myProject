package org.finsen.test.java8;

/**
 * Created by f4v79v9 on 4/28/2015.
 */
public class OverridableImpl implements DefaultInterface {

    @Override
    public String notRequired(){
        return "overridden implementation";
    }

    public static void main(String[] args) {
        OverridableImpl oi = new OverridableImpl();
        System.out.println(oi.notRequired());

    }
}
