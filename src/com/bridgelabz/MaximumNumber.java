package com.bridgelabz;

public class MaximumNumber <E> {

    public static void main(String[] args) {
        System.out.println("-----Test Maximum of 3 Variables-----");

        MaximumNumber<Integer> maximumNumber1 = new MaximumNumber<>();
        System.out.println("The maximum Integer is : " + maximumNumber1.checkMaximum(1, 7, 5));

        MaximumNumber<Float> maximumNumber2 = new MaximumNumber<>();
        System.out.println("The maximum Float is : " + maximumNumber2.checkMaximum(1.25f, 7.480f, 9.55f));

        MaximumNumber<String> maximumNumber3 = new MaximumNumber<>();
        System.out.println("The maximum String is : " + maximumNumber3.checkMaximum("Apple", "Peach", "Banana"));

    }

    <E extends Comparable<E>> E checkMaximum(E x, E y, E z) {
        E max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
}