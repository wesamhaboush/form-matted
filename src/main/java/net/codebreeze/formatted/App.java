package net.codebreeze.formatted;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class App {

    public static final String MY_VERY_LONG_VARIABLE_NAME_WHICH_I_AM_MAKING_UP =
            "This is a made up variable with long name blah blah blah";
    private int[] array = {
            1, 2, 3, 4, 5, 6, 1, 2, 3, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 33,
            44, 55, 55, 66
    };
    private String whyThisIsNotFormatted;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static ArrayList<String> wellThisIsSomeMethodThatWeHaveToHandle(
            String a,
            int b,
            Double c,
            Future<Long> d,
            List<Character> chars,
            Long anotherLong
    ) {
        for (int i = 0; i < 50; i++) {
            System.out.println("ok, we're done");
        }
        return null;
    }
}
