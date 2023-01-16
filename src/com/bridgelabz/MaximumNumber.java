package com.bridgelabz;

public class MaximumNumber {

    public static void main(String[] args) {
        System.out.println("-----Test Maximum of 3 Variables-----");

        MaximumNumber maximumNumber = new MaximumNumber();

        System.out.println("The maximum Integer is : " + maximumNumber.checkMaximum(10, 70, 50));
        System.out.println("The maximum Float is : " + maximumNumber.checkMaximum(1.2f, 7.40f, 9.5f));
        System.out.println("The maximum String is : " + maximumNumber.checkMaximum("Apple", "Peach", "Banana"));
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