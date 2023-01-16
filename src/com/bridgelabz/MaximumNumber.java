package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumNumber<E> {

    public static void main(String[] args) {
        System.out.println("-----Test Maximum of 3 Variables-----");

        MaximumNumber<Integer> maximumNumber1 = new MaximumNumber<>();
        System.out.println("The maximum Integer is : " + maximumNumber1.checkMaximum(10, 70, 50, 20, 60));

        MaximumNumber<Float> maximumNumber2 = new MaximumNumber<>();
        System.out.println("The maximum Float is : " + maximumNumber2.checkMaximum(1.25f, 7.48f, 9.55f, 5.33f, 8.46f));

        MaximumNumber<String> maximumNumber3 = new MaximumNumber<>();
        System.out.println("The maximum String is : " + maximumNumber3.checkMaximum("Apple", "Peach", "Banana", "Mango", "Grapes"));

    }

    <E extends Comparable<E>> E checkMaximum(E var1, E var2, E var3, E var4, E var5) {
        ArrayList<E> list = new ArrayList<>();
        list.add(var1);
        list.add(var2);
        list.add(var3);
        list.add(var4);
        list.add(var5);

        return Collections.max(list);
    }
}