package com.bridgelabz;

public class MaximumNumber {

    public static void main(String[] args) {
        System.out.println("-----Test Maximum of 3 Variables-----");
        MaximumNumber maximumNumber = new MaximumNumber();
        System.out.println("The maximum integer is : " + maximumNumber.checkMaximum(10, 70, 50));
    }

    int checkMaximum(Integer x, Integer y, Integer z) {
        int max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
}