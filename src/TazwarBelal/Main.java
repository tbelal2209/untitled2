package TazwarBelal;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Palindrome("racecar"));
    }



    public static boolean Palindrome(String str)
    {
        String racecar = "";
        for (int i = str.length(); i >1; i--) {
            racecar = racecar + str.substring(i -1, i);
        }
        if (racecar.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
}
