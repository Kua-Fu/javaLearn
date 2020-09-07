package thinkJava;

/**
 * property java
 */

import java.util.*;

public class Property{
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("---memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println(
            "total Memory = " 
            + rt.totalMemory()
            + " free memory = "
            + rt.freeMemory()
        );
        try {
            Thread.currentThread().sleep(5 * 1000);
        } catch(InterruptedException e) {

        }
    }
}