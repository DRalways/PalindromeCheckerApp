 class PalindromeChecker {
    
    // Method to check palindrome
    boolean checkPalindrome(String input) {

        for(int i = 0; i < input.length() / 2; i++) {

            if(input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }

        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


