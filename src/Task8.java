import java.util.List;
import java.util.stream.Collectors;

public class Task8 {

    public void removeDuplicates(List<Integer> listOfIntegers){
        listOfIntegers
                .stream()
                .distinct()
                .forEach(System.out::println);
    }

}
