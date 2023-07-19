import java.util.List;

public class Task7 {

    public void toUpperCase(List<String> listOfStrings){
        listOfStrings
                .stream()
                .map(e -> e.toUpperCase())
                .forEach(System.out::println);
    }
}
