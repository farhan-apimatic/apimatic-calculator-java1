/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.examples.models;

import java.util.*;

public class AdvanceBuilder {
    //the instance to build
    private Advance advance;

    /**
     * Default constructor to initialize the instance
     */
    public AdvanceBuilder() {
        advance = new Advance();
    }

    public AdvanceBuilder latitude(double latitude) {
        advance.setLatitude(latitude);
        return this;
    }

    public AdvanceBuilder longitude(double longitude) {
        advance.setLongitude(longitude);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Advance build() {
        return advance;
    }
}