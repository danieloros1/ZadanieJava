package com.company.secondsolution;

public class SecondSolution {

    public static String multiply(String firstArg, String secondArg) {

        int m = firstArg.length();
        int n = secondArg.length();
        int[] position = new int[m + n];

        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int partialMultiply = (firstArg.charAt(i) - '0') * (secondArg.charAt(j) - '0');
                int sum = partialMultiply + position[i+j+1];
                position[i+j] += sum / 10;
                position[i+j+1] = sum % 10;
            }
        }

        StringBuilder multiplyResult = new StringBuilder();
        for(int number : position){
            if(!(multiplyResult.length() == 0 && number == 0)) {
                multiplyResult.append(number);
            }
        }
        return multiplyResult.toString();
    }
}
