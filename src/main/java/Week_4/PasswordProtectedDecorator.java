package Week_4;

import java.util.ArrayList;
import java.util.List;

class PasswordProtectedDecorator {
    private DataStructure dataStructure;
    private String password;

    public PasswordProtectedDecorator(DataStructure dataStructure, String password) {
        this.dataStructure = dataStructure;
        this.password = password;
    }

    public List<String> getProtectedData(String inputPassword) {
        List<String> protectedData = new ArrayList<>();
        if (inputPassword.equals(password)) {
            protectedData.addAll(dataStructure.getData());
        } else {
            System.out.println("Väärä salasana. Pääsy evätty.");
        }
        return protectedData;
    }
}