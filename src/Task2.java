import java.util.List;

public class Task2 {

    public void incrementElements(List<Integer> listOfIntegers, int incrementValue){
        listOfIntegers
                .stream()
                .map(e -> e + incrementValue)
                .forEach(System.out::println);
    }
}
