package com.company;

import java.util.Random;

/**
 * Created by tlosev on 1/4/17.
 */
public class Methods {

    public int genRandom(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + 1;
    }
}
