/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.examples.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import io.apimatic.examples.models.*;
import io.apimatic.examples.exceptions.*;
import io.apimatic.examples.APIHelper;
import io.apimatic.examples.Configuration;
import io.apimatic.examples.testing.TestHelper;
import io.apimatic.examples.controllers.SimpleCalculator;

import com.fasterxml.jackson.core.type.TypeReference;

public class SimpleCalculatorTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static SimpleCalculator controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getSimpleCalculator();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Check if multiplication works
     * @throws Throwable
     */
    @Test
    public void testMultiply() throws Throwable {
        // Parameters for the API call
        OperationType operation = OperationType.fromString("MULTIPLY");
        double x = 4d;
        double y = 5d;

        // Set callback and perform API call
        double result = 0;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.newEndpointItIs(operation, x, y);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
 
        assertEquals("Response does not match expected value", 
            20, result, ASSERT_PRECISION);
    }

}
