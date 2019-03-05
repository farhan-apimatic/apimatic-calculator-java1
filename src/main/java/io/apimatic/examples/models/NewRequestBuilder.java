/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.examples.models;

import java.util.*;

public class NewRequestBuilder {
    //the instance to build
    private NewRequest newRequest;

    /**
     * Default constructor to initialize the instance
     */
    public NewRequestBuilder() {
        newRequest = new NewRequest();
    }

    public NewRequestBuilder counter(int counter) {
        newRequest.setCounter(counter);
        return this;
    }

    public NewRequestBuilder dATA(DATA dATA) {
        newRequest.setDATA(dATA);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public NewRequest build() {
        return newRequest;
    }
}