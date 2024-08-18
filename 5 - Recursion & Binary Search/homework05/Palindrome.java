/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW05
The purpose of this assignment is to help us learn Recursion.
*/
package homework05;

public class Palindrome {

    public static boolean isPalindrome(String sentence){
        /*
        This method checks if the given string is Palindrome or not and returns a boolean value.
        If it's a Palindrome: returns true
        If it's not a Palindrome: returns false
         */
        String withoutcs = sentence.replaceAll("[,\\s]", ""); //removes commas and spaces
        String cleanSentence = withoutcs.toLowerCase(); // converts the concatenated string to lowercase 
        int length = cleanSentence.length();
        // Base case: if the length of the string is 0 or 1, return true.
        if(length <= 1){
            return true;
        } else if(cleanSentence.charAt(0)==cleanSentence.charAt(length-1)){
            // Recursive case: if the first and last characters of the string are the same,
            // and then recursively check the substring between them.
            return isPalindrome(cleanSentence.substring(1, length-1));
        } else {
            // If the first and last characters are different, it's not a palindrome.
            return false;
        }
    }
    /**
     * The main method calls the method isPalindrome() and prints the result.
     * @param args
     */
    public static void main(String[] args){
        String sentence = "Able was I, ere I saw Elba";
        // String sentence1 = "A man, a plan, a canal, Panama";
        // String sentence2 = "Desserts, I stressed";
        // String sentence3 = "kayak";
        System.out.println(isPalindrome(sentence));
        System.out.println(isPalindrome("Not a Palindrom"));
    }
}
// end of class Palindrome
