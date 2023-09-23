import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {

    private List<Integer> odd = Arrays.asList(1,3,5,7,9,11,13,15);
    private List<Integer> even = Arrays.asList(2,4,6,8);
    public void mixStreamElement(){
        Stream<Integer> first = odd.stream();
        Stream<Integer> second = even.stream();

        Stream<Integer> resultStream = zip(first, second);
        List<Integer> mixedStreams = resultStream.collect(Collectors.toList());

        System.out.println("first = " + odd);
        System.out.println("second = " + even);
        System.out.println("task_5_mixedStream = " + mixedStreams);

    }
    private static Stream<Integer> zip(Stream<Integer> first, Stream<Integer> second){

        List<Integer> firstArray = first.collect(Collectors.toList());
        List<Integer> secondArray = second.collect(Collectors.toList());

        int sizeOfShortArray= firstArray.size() < secondArray.size() ? firstArray.size() : secondArray.size();

        List<Integer> resultArray = new ArrayList<>();
        for (int i = 0; i < sizeOfShortArray; i++) {
            resultArray.add(firstArray.get(i));
            resultArray.add(secondArray.get(i));
        }

        return resultArray.stream();

    }
}
