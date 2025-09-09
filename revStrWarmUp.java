// RevStrWarmUp.java
// aD 9/9/2025

public class revStrWarmUp {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my Reverse String Warm Up program!");

        // Create program that reverses a string using a for loop
        // Define this program in terms of input/processing/output

        // There is no input in this program, everything is hardcoded
        // processing is: Decrementing a for loop, finding the length of the string,
        // create a new string
        // with the end characters at the end of the string

        // Create a couple of string variables and initialize my Str
        String myStr = "Hello World";
        String myRevStr = "";

        // Create a for loop and use it to get each char from the str and use it
        // I know how to decrement a for loop

        int strLength = myStr.length();

        System.out.println("\n strLength is " + strLength);
        System.out.println("\n char at index 11 is  " + myStr.charAt(10));



        for(int i = strLength-1; i >= 0; i--) {
            System.out.println("\n the char at : " + i + " is " + myStr.charAt(i) );
            myRevStr += myStr.charAt(i);
        }

        System.out.println("\n nyRevStr is: " + myRevStr + "\n\n");



    }
}