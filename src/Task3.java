import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    private String[] array = new String[]{"1, 2, 0", "4, 5"};
    public void arrayFilter() {

        List<String> listNumbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String[] numbers = array[i].split(", ");
            for (String number : numbers) {
                listNumbers.add(number);
            }
        }

        Stream<String> numbersStream = listNumbers.stream().sorted();

        List<String> filteredNames = numbersStream.collect(Collectors.toList());
        System.out.println("task_3_filter_v1 = \"" + filteredNames + "\"");

        StringBuilder result = new StringBuilder("\"");
        for (String name : filteredNames) {
            result.append(name).append(", ");
        }
        result.delete(result.length() - 2, result.length()).append("\"");
        System.out.println("task_3_filter_v2 = " + result);

    }
}
