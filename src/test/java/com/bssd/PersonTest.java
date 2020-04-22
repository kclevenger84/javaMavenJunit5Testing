package com.bssd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testGetName() {
        assertEquals("Matthew", new Person().getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(29, new Person().getAge());
    }
}
