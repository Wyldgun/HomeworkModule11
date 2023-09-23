import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

    private static final long seed = 123456789;
    private static final long a = 25214903917L;
    private static final long c = 11;
    private static final long m = 281474976710656L;

    public void myRandomNumberGenerator() {
        Stream<Long> numbers = randomNumberCount();
        List<Long> randomNumbers = numbers.collect(Collectors.toList());
        System.out.println("task_4_random = " + randomNumbers);
    }

    private static Stream<Long> randomNumberCount() {
        return Stream.iterate(seed, x -> (a * x + c) % m).limit(5);
    }
}
