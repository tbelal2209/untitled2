package com.company;

public class Main {

    public static void main(String[] args) {


        // write your code here
        System.out.println(Palindrome("racecar"));
        System.out.println(cutOut("Alphamale"));

    }
    // write your code here
    public static boolean Palindrome(String str) {
        String racecar = "";
        for (int i = str.length() + 1; i > 1; i--) {
            racecar = racecar + str.substring(i - 2, i - 1);
        }
        if (racecar.equals(str)) {
            return true;
        } else {
            return false;
        }
    }


    public static String cutOut(String mainstr){
              String substr = "cat";
            return  mainstr.substring(2, mainstr.length()) + " " + substr ;


        }

    }
