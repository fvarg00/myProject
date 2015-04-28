package org.finsen.test.random.code;

public class StaticInitializer {

     
/* Static initializer: executes when the class is loaded. */  
static {  
    System.out.println("class Foo loaded!");  
}  

/* Instance initializer: excutes when calling new Foo(),
  BEFORE anything inside the Foo constructor */  
{  
    System.out.println("new instance of Foo about to be created!");  
    // has access to internal Foo methods:  
    print("instance initializer has access to internal methods!");

    //throw new RuntimeException("foo bar exception");
}  

/* Constructor */  
public StaticInitializer() {  
    System.out.println("Foo constructor statements!");  
}  

public void print(String msg) {  
    System.out.println(msg);  
}  


static public void main(String[] args) {  
    new StaticInitializer();  
    System.out.println(" ");  
    new StaticInitializer();  
}  
}
