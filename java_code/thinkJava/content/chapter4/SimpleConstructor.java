package thinkJava.content.chapter4;

class Rock {
    Rock() {
        System.out.println("create rock");
    }
}

public class SimpleConstructor {
   public static void main(String[] args) {
       for(int i=0; i < 10; i++) {
           new Rock();
       }
   } 
}