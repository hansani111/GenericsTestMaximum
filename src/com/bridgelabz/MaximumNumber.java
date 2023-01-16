package com.bridgelabz;

public class MaximumNumber {

    public static void main(String[] args) {
        System.out.println("-----Test Maximum of 3 Variables-----");
        MaximumNumber maximumNumber = new MaximumNumber();
        System.out.println("The maximum float is : " + maximumNumber.checkMaximum(1.7f, 7.5f, 5.9f));
    }

    float checkMaximum(Float x, Float y, Float z) {
        float max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
}