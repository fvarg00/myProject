package org.finsen.test.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by f4v79v9 on 4/28/2015.
 */
public class NashhornTest {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName( "JavaScript" );

        System.out.println( engine.getClass().getName() );
        try {
            System.out.println( "Result:" + engine.eval( "function f() { return 1; }; f() + 1;" ) );
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
