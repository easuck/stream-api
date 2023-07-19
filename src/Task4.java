import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Task4 {

    public OptionalInt findMax(List<Integer> listOfIntegers){
        return listOfIntegers
                .stream()
                .mapToInt(Integer::intValue)
                .max();
    }

    public OptionalInt findMin(List<Integer> listOfIntegers){
        return listOfIntegers
                .stream()
                .mapToInt(Integer::intValue)
                .min();
    }
}
