package binarySearch;

// import java.lang.reflect.Array;
// import java.util.List;

public class T1 {

    private static int binarySearch(int list1[], int item) {
        int low = 0;
        int high = list1.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            int guess = list1[mid];
            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    };

    public static void main(String[] args) {

        int list1[] = { 1, 2, 3, 5 };
        System.out.println("test start");
        // int item = 3;
        int item = 6;
        int i = binarySearch(list1, item);
        System.out.println("index is " + i);
            
        Point myPoint;
        myPoint = new Point();
        myPoint.x = 10.0;
        myPoint.y = 20.0;

    };


}

// class ReverseString {

// public static String reverseIt(String source) {

// int i, len = source.length();

// StringBuffer dest = new StringBuffer(len);

// for (i = (len - 1); i >= 0; i--) {

// dest.appendChar(source.charAt(i));

// }

// return dest.toString();

// }

// }