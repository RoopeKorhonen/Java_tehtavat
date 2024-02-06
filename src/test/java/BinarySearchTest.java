import Week_3_OhtuUnitTesting.BinarySearch;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTest {

    public static void main(String[] args) {
        testBinarySearch();
    }

    public static void testBinarySearch() {
        int[] a = {1, 2, 3, 4};

        // Kutsu search-metodia BinarySearch-luokasta
        int result = BinarySearch.search(a, 3);

        // Tarkista, että tulos on odotettu
        assertTrue(result == 2);  // Koska indeksointi alkaa 0:sta, 3 on indeksissä 2.
    }
}
