package com.csmithswim;

import java.util.HashMap;
import java.util.Map;

public class Solutions {

    public static void priceCheck() {
        //input - 4 string arrays
        //output - int(sum of errors)

        //instantiate variables(different products, prices, sold products, etc.)
        //make a hashmap of products/prices
        //iterate through items sold
        //IF a sold item's price != inventory product's price
        //sum++
        //return error

        //Sample input 0
        String[] products = {"rice", "sugar", "wheat", "cheese"};
        double[] productPrices = {16.89, 59.92, 20.89, 345.99};
        String[] productSold = {"rice", "cheese"};
        double[] soldPrice = {18.99, 400.89};

//        String[] products = {"chocolate", "cheese", "tomato"};
//        double[] productPrices = {15.00, 300.90, 23.44};
//        String[] productSold = {"chocolate", "cheese", "tomato"};
//        double[] soldPrice = {15, 300.90, 10.00};

        Map<String, Double> priceList = new HashMap<>();

        int pricingErrors = 0;

        for (int i = 0; i < products.length; i++) {
            priceList.put(products[i], productPrices[i]);
        }

        for (int i = 0; i < productSold.length; i++) {
            if (priceList.get(productSold[i]) != soldPrice[i]) {
                pricingErrors++;
            }
        }
        System.out.println(pricingErrors);
    }

    public static void lastAndSecondLast(String input) {
        System.out.println(input.substring(input.length() - 1) + " " + input.substring(input.length() - 2, input.length() - 1));
    }

    public static void countingClosedPaths(int input) {

        //Input Int
        //Out Int
        //digits 0, 4, 6, 9 all equals 1 closed path
        //digit 8 equals 2 closed paths

        //Pseudo-Code
        //create count variable
        //convert int to string || char[] || string[]
        //iterate through the string || char[] || string[]
        //IF 0 || 4 || 6 || 9
        //count++
        //IF 8 count += 2
        //return counting variable

        //First test case 630
        //Second test case 649578

        int testCase = 649578;
        int sum = 0;

        String[] testCaseStringArray = String.valueOf(testCase).split("");
        for (String e : testCaseStringArray) {
            if (e.equals("0") || e.equals("4")
                    || e.equals("6") || e.equals("9")) {
                sum++;
            }
            if (e.equals("8")) {
                sum += 2;
            }
        }
        System.out.println(sum);
    }

    public static int connectedGroups(int n, String[] array) {


        //parameter is n(size of the binary string array, string[]
        //output is int

        //store variable of []array and a groupCounting variable
        //traverse array two dimensionally and compare row index with column index
        //in a linear way
        //IF row/column && column/row == 1 then increment groupCounting
        //Return n - groupCounting

        String[] exampleCase = {"110", "110", "001"};
        String[] testCase0 = {"1100", "1110", "0110", "0001"};
        int groupCounting = 0;
        int loopCounter = 0;

        //first traversal is 0/1 && 1/0
        //second traversal is 1/2 && 2/1
        for (int i = 0, j = 1; loopCounter < testCase0.length - 1; i++, j++) {
            if (testCase0[i].charAt(j) == '1' && testCase0[j].charAt(i) == '1') {
                groupCounting++;
            }
            loopCounter++;
        }

        System.out.println(testCase0.length - groupCounting);
        return testCase0.length - groupCounting;
    }

    public static void validEmailAddress(String[] array) {
        //Write a regex that tests for the following
        //starts with 1-6 lowercase english letters
        //lowercase letters can be followed by an optional _
        //the optional underscore is followed by 0-5 optional digits
        //the domain must be hackerrank.com

        String[] testCase0 = {"julia@hackerrank.com", "julia_@hackerrank.com", "julia_0@hackerrank.com",
                "julia0_@hackerrank.com", "julia@gmail.com"};

        String regex = "[a-z]{1,6}(_)?[0-9]{0,5}@hackerrank.com";

        for (String e : testCase0) {
            System.out.println(e.matches(regex));
        }
    }
}

