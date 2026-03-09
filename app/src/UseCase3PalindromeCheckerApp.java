public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version : 1.0");

        String original = "madam";
        String reverse = "";

        for(int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if(original.equals(reverse)) {
            System.out.println("Is a Palindrome? : True");
        } else {
            System.out.println("Is a Palindrome? : False");
        }
    }
}

