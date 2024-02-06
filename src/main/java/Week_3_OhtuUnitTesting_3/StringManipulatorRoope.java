package Week_3_OhtuUnitTesting_3;

// StringManipulatorRoope.java
public class StringManipulatorRoope {

    // Method to reverse the given text
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to capitalize the given text
    public String capitalize(String input) {
        return input.toUpperCase();
    }
}
