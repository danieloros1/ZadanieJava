package com.company.firstsoulution;

import java.math.BigInteger;

public class FirstSolution {

    public static BigInteger multiplication(String firstArg, String secondArg) {
        BigInteger first = new BigInteger(firstArg);
        BigInteger result = first.multiply(new BigInteger(secondArg));
        return result;
    }
}
