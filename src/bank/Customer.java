package bank;

import logging.LogMethods;

// Start of user code for imports
// End of user code

/**
 * Customer class definition.
 * Generated by the TouchCORE code generator.
 */
public class Customer implements LogMethods{
    
    protected String name;
    
    public Customer(String givenName) {
        this.name = givenName;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
