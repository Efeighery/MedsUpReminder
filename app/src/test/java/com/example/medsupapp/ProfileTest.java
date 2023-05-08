package com.example.medsupapp;

import junit.framework.TestCase;

public class ProfileTest extends TestCase {

    public void testOnCreate() {
        String ageIn = "39";
        String ageOut;
        String expectedAge = "27";

        Profile proInstance = new Profile();
        ageOut = proInstance.getString(Integer.parseInt(ageIn));

        assertEquals(expectedAge, ageOut, ageIn);

    }
}