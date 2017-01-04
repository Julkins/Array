package com.company;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import com.sun.org.apache.xerces.internal.impl.xs.util.ObjectListImpl;
import com.sun.org.glassfish.external.statistics.RangeStatistic;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main extends Methods {

    public static void main(String[] args) {


        int[] array;
        array = new int[8];
        Random rnd = new Random();


        for (int i = 0; i < array.length; i++) {

        array[i] = rnd.nextInt();
            System.out.print(array[i] + " ");
        }

    }
}









