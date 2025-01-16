class PalindromeChecker {

    // Attribute to store the text to be checked
    private String text;

    // Constructor to initialize the text attribute
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Remove non-alphanumeric characters and convert to lowercase
        String filteredText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the filtered text and compare it with the original filtered text
        String reversedText = new StringBuilder(filteredText).reverse().toString();
        return filteredText.equals(reversedText);
    }

    // Method to display the result of palindrome check
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    // Main method for testing the PalindromeChecker class
    public static void main(String[] args) {
        // Example text to check
        String inputText = "A man, a plan";

        // Create an instance of PalindromeChecker with the input text
        PalindromeChecker checker = new PalindromeChecker(inputText);

        // Display the result of the palindrome check
        checker.displayResult();
    }
}
