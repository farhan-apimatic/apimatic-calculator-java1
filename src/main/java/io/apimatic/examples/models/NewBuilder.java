/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.examples.models;

import java.util.*;

public class NewBuilder {
    //the instance to build
    private New mnew;

    /**
     * Default constructor to initialize the instance
     */
    public NewBuilder() {
        mnew = new New();
    }

    public NewBuilder counter(int counter) {
        mnew.setCounter(counter);
        return this;
    }

    public NewBuilder advance(Advance advance) {
        mnew.setAdvance(advance);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public New build() {
        return mnew;
    }
}