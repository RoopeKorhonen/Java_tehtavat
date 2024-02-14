package Week_4;

import java.util.ArrayList;
import java.util.List;

class DataStructure {
    private List<String> data;

    public DataStructure() {
        this.data = new ArrayList<>();
    }

    public void addData(String item) {
        this.data.add(item);
    }

    public List<String> getData() {
        return this.data;
    }
}