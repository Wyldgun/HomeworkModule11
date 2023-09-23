import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    private List<String> names = Arrays.asList("Oleg", "Bohdan", "Andrii", "Olga", "Anastasia", "Larysa");
    public void oddIndexListFilter() {

        Stream<String> nameStream = names
                .stream()
                .filter(name -> names.indexOf(name) % 2 == 1)
                .map(name -> names.indexOf(name) + ". " + name);

        List<String> filteredNames = nameStream.collect(Collectors.toList());
        System.out.println("task_1_filter = " + filteredNames);
    }
}
