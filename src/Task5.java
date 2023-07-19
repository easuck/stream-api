import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    public String concatenateStrings(List<String> listOfStrings){
        return listOfStrings
                .stream()
                .collect(Collectors.joining(", "));
    }
}
