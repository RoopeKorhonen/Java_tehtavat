package Week_3_OhtuUnitTesting;

public class BinarySearch {
    public static int search(int[] a, int x) {
        // Toteuta binäärihaku tässä
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == x) {
                return mid; // Löydettiin
            }

            if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Ei löytynyt
    }

    public static int checkedSearch(int[] a, int x) {
        // Toteuta tarkistettu haku tässä
        // Voit kutsua search-metodia tässä
        int result = search(a, x);

        if (result != -1) {
            System.out.println("Luku " + x + " löytyi indeksistä " + result);
        } else {
            System.out.println("Lukua " + x + " ei löytynyt taulukosta.");
        }

        return result;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchValue = 7;

        checkedSearch(sortedArray, searchValue);
    }
}
