package com.volod96.theClassicals.reboot.type.constraints;

import com.volod96.theClassicals.reboot.util.AssertionUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Popularity {
    private float value;
    public static final float MIN_POPULARITY = 0.0f;
    public static final float MAX_POPULARITY = 10.0f;
    private static final Logger log = LoggerFactory.getLogger(Popularity.class);

    public Popularity(float value) {
        AssertionUtility.assertBoundary(value, MIN_POPULARITY, MAX_POPULARITY);
        this.value = value;
    }

    public float getValue() {
        return this.value;
    }

    public void setValue(float newValue) {
        if(newValue >= MIN_POPULARITY && newValue <= MAX_POPULARITY) {
            this.value = newValue;
        }
        else {
            log.error("Popularity class setter failed because the given value, " + newValue +
                      ", did not match the required boundaries, " + MIN_POPULARITY + " and " + MAX_POPULARITY);
        }
    }


}
