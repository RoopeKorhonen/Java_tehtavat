package Week_4;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DataStructure dataStructure = new DataStructure();

        dataStructure.addData("Data 1");
        dataStructure.addData("Data 2");

        PasswordProtectedDecorator decorator = new PasswordProtectedDecorator(dataStructure, "salasana");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Anna salasana: ");
        String inputPassword = scanner.nextLine();

        List<String> protectedData = decorator.getProtectedData(inputPassword);

        if (!protectedData.isEmpty()) {
            System.out.println("Suojattu data: " + protectedData);
        }
    }
}