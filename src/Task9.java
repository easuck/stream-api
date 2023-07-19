import java.util.List;

public class Task9 {

    public boolean checkIfAgeMoreThanNumber(List<User> listOfUsers, int age){
        return listOfUsers
                .stream()
                .allMatch(u -> u.getAge() > age);
    }
}
