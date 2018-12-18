package com.testtravis;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Text;

import static org.junit.Assert.*;

public class TextHelperTest {

    private TextHelper textHelper = null;

    @Before
    public void setUp() throws Exception {
        textHelper = TextHelper.getInstance();
    }

    @After
    public void tearDown() throws Exception {
        textHelper = null;
    }

    @Test
    public void testGetText() {
        Assert.assertEquals(textHelper.getText(49), "Low");
    }
}