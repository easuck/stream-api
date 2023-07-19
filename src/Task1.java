import java.util.List;

public class Task1 {

    public void filterStringsStartingLetter(List<String> listOfStrings, char startingLetter){
        listOfStrings
                .stream()
                .filter(e -> e.toLowerCase().charAt(0) == startingLetter)
                .forEach(System.out::println);
    }
}
