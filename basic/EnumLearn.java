package basic;

public class EnumLearn {

    enum Level {
        LOW, MEDIUM, HIGH,
    }

    public static void main(String[] args) {

        // (1) 简单print
        printLevel();
        // (2) loop
        loopLevel();
        // (3) switch
        switchLevel();

    }

    // (1) 简单print
    public static void printLevel() {
        Level myVar = Level.MEDIUM;
        System.out.println("myVar: " + myVar);
    }

    // (2) loop
    public static void loopLevel() {
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }

    // (3) switch
    public static void switchLevel() {
        Level myVar = Level.MEDIUM;

        switch (myVar) {

            case LOW:
                System.out.println("Low level");
                break;

            case MEDIUM:

                System.out.println("Medium level");
                break;

            case HIGH:
                System.out.println("High level");
                break;

        }
    }

}