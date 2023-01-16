package com.bridgelabz;

public class MaximumNumber {

    public static void main(String[] args) {
        System.out.println("-----Test Maximum of 3 Variables-----");
        MaximumNumber maximumNumber = new MaximumNumber();
        System.out.println("The maximum string is : " + maximumNumber.checkMaximum("Apple", "Peach", "Banana"));
    }

    String checkMaximum(String x, String y, String z) {
        String max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
}