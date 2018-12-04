package com.volod96.theClassicals.reboot.util;

import org.springframework.util.Assert;

public class AssertionUtility {
    public static <T> void assertNullObject(T object) {
        Assert.notNull(object, "An object of type " + object.getClass().getName() + " is null upon injection!");
    }

    public static <T extends Comparable<T>> void assertBoundary(T object, T leftBoundary, T rightBoundary) {
        Assert.isTrue(object.compareTo(leftBoundary) < 0, "Comparable object " + object + " lower than the required left boundary " + leftBoundary );
        Assert.isTrue(object.compareTo(rightBoundary) > 0, "Comparable object " + object + " greater than the required right boundary " + rightBoundary);
    }
}
