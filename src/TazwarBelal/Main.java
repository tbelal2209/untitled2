package com.company;

public class Main {

    public static void main(String[] args) {


        // write your code here
        System.out.println(Palindrome("racecar"));
        System.out.println(cutOut("Alphamale"));
        System.out.println(sumUpTo(5));
        System.out.println(primePrinter(3));
        System.out.println(tensdigit(1267));
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

    public static int sumUpTo(int num){
        int sum = 0;
        int i = 0;
        while( i <= num){
            sum = sum + i;
            i++;
        }
        return sum;
    }

        public static boolean primePrinter(int n) {
            for (int i = 2; i <= n; i++) {
                n =  n % i;
            }
            if (n != 0) {
                return true;
            }

            else {
                return false;
            }
        }
    public static int tensdigit(int n){
int output = n % 100;
output = output/10;
return output;
    }

            }
