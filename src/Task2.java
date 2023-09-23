import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    private List<String> names = Arrays.asList("Oleg", "Bohdan", "Andrii", "Olga", "Anastasia", "Larysa");
    public void upperCaseListFilter() {

        Stream<String> nameStream = names
                .stream()
                .map(name -> name.toUpperCase())
                .sorted((o1, o2) -> o2.toString().compareTo((String) o1));

        List<String> filteredNames = nameStream.collect(Collectors.toList());
        System.out.println("task_2_filter = " + filteredNames);
    }
}
