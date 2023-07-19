import java.util.Comparator;
import java.util.List;

public class Task3 {

    public void filterByAge(List<User> listOfUsers){
        listOfUsers
                .stream()
                .sorted(Comparator.comparing(User::getAge))
                .forEach(System.out::println);
    }

    public void filterByName(List<User> listOfUsers){
        listOfUsers
                .stream()
                .sorted(Comparator.comparing(User::getName))
                .forEach(System.out::println);
    }
}
