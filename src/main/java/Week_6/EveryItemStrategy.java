package Week_6;
import java.util.List;

class EveryItemStrategy implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String item : list) {
            result.append(item).append("\n");
        }
        return result.toString();
    }
}