package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    private Restaurant r;

    @Before
    public void setUp() throws Exception {
        this.r = new Restaurant();
    }

    @After
    public void tearDown() throws Exception {
        this.r = null;
    }

    @Test
    public void addServeur() {

    }
}