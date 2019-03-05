/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.examples.models;

import java.util.*;

public class DATABuilder {
    //the instance to build
    private DATA dATA;

    /**
     * Default constructor to initialize the instance
     */
    public DATABuilder() {
        dATA = new DATA();
    }

    public DATABuilder latitude(double latitude) {
        dATA.setLatitude(latitude);
        return this;
    }

    public DATABuilder longitude(double longitude) {
        dATA.setLongitude(longitude);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DATA build() {
        return dATA;
    }
}