package onJava8.content.chapter6;

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }

}

class Milhourse {
}

public class Lisa extends Homer {
    // @Override
    void doh(Milhourse m) {
        System.out.println("doh(Milhourse)");
    }

    @Override
    float doh(float fl) {
        super.doh(fl);
        System.out.println("doh(fl)");
        return 2.0f;
    }

    public static void main(String[] args) {
        Lisa li = new Lisa();
        li.doh(1.0f);
    }
}