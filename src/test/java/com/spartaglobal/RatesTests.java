package com.spartaglobal;

import com.spartaglobal.deserialiserates.RatesDeserialiser;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RatesTests {

    private static RatesDeserialiser rates;

    @BeforeClass
    public static void setup(){
        rates = new RatesDeserialiser("Resources/rates.json");
    }

    @Test

    public void testSuccessIsTrue(){
        Assert.assertTrue(rates.ratesMapped.success);
    }



    @Test
    public void testDate(){
        Assert.
    }
}
