package Week_6;
import java.util.List;

class EveryOtherItemStrategy implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if ((i + 1) % 2 == 0) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}