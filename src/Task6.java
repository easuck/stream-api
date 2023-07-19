import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6 {

    public void groupUsersByNationality(List<User> listOfUsers){
          listOfUsers
                .stream()
                .collect(Collectors.groupingBy(User::getNationality))
                 .entrySet()
                 .stream()
                 .map(e -> e.getKey() + " : " + e.getValue())
                 .forEach(System.out::println);
    }
}
