package com.company.tests;


import com.company.Main;
import com.company.firstsoulution.FirstSolution;
import com.company.secondsolution.SecondSolution;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void FirstSolutionResultTest() {
        BigInteger number = new BigInteger("137174210013717420998628257899862825790");
        assertEquals(number, FirstSolution.multiplication("12345678901234567890","11111111111111111111"));
    }

    @org.junit.jupiter.api.Test
    void SecondSolutionResultTest() {
        assertEquals("137174210013717420998628257899862825790", SecondSolution.multiply("12345678901234567890","11111111111111111111"));
    }

    @org.junit.jupiter.api.Test
    void ArgumentIsNotNumberTest() {
        assertFalse(Main.numberCheck("c","1231231"));

    }
}