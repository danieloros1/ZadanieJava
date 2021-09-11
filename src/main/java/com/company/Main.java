package com.company;

import com.company.firstsoulution.FirstSolution;
import com.company.secondsolution.SecondSolution;

public class Main {

    public static boolean numberCheck(String firstNumber, String secondNumber){
        return firstNumber.matches("-?\\d+(\\.\\d+)?") && secondNumber.matches("-?\\d+(\\.\\d+)?");
    }

    public static void main(String[] args) {

        if(args[0].equals("alg1") && numberCheck(args[1], args[2])) {
            System.out.println(FirstSolution.multiplication(args[1], args[2]));
        }
        else if(args[0].equals("alg2") && numberCheck(args[1], args[2])) {
            System.out.println(SecondSolution.multiply(args[1], args[2]));
        }
        else {
            System.out.println("Invalid first argument or wrong numbers, choose alg1 or alg2 as first argument and type correct numbers!");
        }
    }
}