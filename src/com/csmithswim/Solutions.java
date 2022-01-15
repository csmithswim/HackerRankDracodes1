package com.csmithswim;

public class Solutions {

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
}

