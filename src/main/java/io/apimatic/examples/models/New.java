/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.examples.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class New 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4615494614276394944L;
    private int counter;
    private Advance advance;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("counter")
    public int getCounter ( ) { 
        return this.counter;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("counter")
    public void setCounter (int value) { 
        this.counter = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("advance")
    public Advance getAdvance ( ) { 
        return this.advance;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("advance")
    public void setAdvance (Advance value) { 
        this.advance = value;
    }
 
}
