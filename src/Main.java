import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        //task 1
        Task1 task1 = new Task1();
        List<String> task1List = new ArrayList<>();
        task1List.add("арбуз");
        task1List.add("апеьсин");
        task1List.add("мандарин");
        task1List.add("лимон");
        task1List.add("абрикос");
        char startingLetter = 'а';

        System.out.println("Задание 1: отсортированный список, строки которого начинаются с символа \'" + startingLetter + "\'");
        task1.filterStringsStartingLetter(task1List, startingLetter);

        main.delimiter();
        //task 2
        Task2 task2 = new Task2();
        List<Integer> task2list = Arrays.asList(1, 2, 3, 4, 5);
        int incrementValue = 10;

        System.out.println("Задание 2: элементы списка, увеличенные на " + incrementValue);
        task2.incrementElements(task2list, incrementValue);

        main.delimiter();
        //task 3
        Task3 task3 = new Task3();
        List<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(new User("Egor", 22));
        listOfUsers.add(new User("Vanya", 21));
        listOfUsers.add(new User("Albert", 40));
        listOfUsers.add(new User("Abdul", 60));

        System.out.println("Задание 3: Список пользователей, отсортированный по возрасту");
        task3.filterByAge(listOfUsers);
        System.out.println("Задание 3: Список пользователей, отсортированный по имени");
        task3.filterByName(listOfUsers);

        main.delimiter();
        //task 4
        Task4 task4 = new Task4();
        List<Integer> task4list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Задание 4: Максимальный элемент списка " + task4.findMax(task4list).getAsInt());
        System.out.println("Задание 4: Минимальный элемент списка " + task4.findMin(task4list).getAsInt());

        main.delimiter();
        //task 5
        Task5 task5 = new Task5();
        List<String> task5list = new ArrayList<>();
        task5list.add("Первый");
        task5list.add("Второй");
        task5list.add("Третий");

        System.out.println("Задание 5: Строки, объединенные в одну через запятую\n" + task5.concatenateStrings(task5list));

        main.delimiter();
        //task6
        Task6 task6 = new Task6();
        List<User> task6list = new ArrayList<>();
        task6list.add(new User(User.Nationality.Русский));
        task6list.add(new User(User.Nationality.Русский));
        task6list.add(new User(User.Nationality.Украиенец));
        task6list.add(new User(User.Nationality.Украиенец));
        task6list.add(new User(User.Nationality.Белорус));
        task6list.add(new User(User.Nationality.Белорус));

        System.out.println("Задание 6: Пользователи, сгрупированные по национальности (имя и возраст не заполнены)");
        task6.groupUsersByNationality(task6list);

        main.delimiter();
        //task 7
        Task7 task7 = new Task7();
        List<String> task7list = Arrays.asList("абабабабабаб", "ибибибибибибиб");
        System.out.println("Задание 7: Строки, символы которых приведены к верхнему регистру");
        task7.toUpperCase(task7list);

        main.delimiter();
        //task 8
        Task8 task8 = new Task8();
        List<Integer> task8list = Arrays.asList(1, 2, 2, 3, 4, 4);
        System.out.println("Задание 8: Список чисел без дубликатов");
        task8.removeDuplicates(task8list);

        main.delimiter();
        //task 9
        Task9 task9 = new Task9();
        List<User> task9list = new ArrayList<>();
        List<User> task9list2 = new ArrayList<>();
        task9list.add(new User("Aboba", 20));
        task9list.add(new User("Abuba", 25));
        task9list2.add(new User("Mikrochel", 10));
        task9list2.add(new User("Abiba", 20));
        int age = 18;

        System.out.println("Задание 9: Все пользователи первого списка старше чем " + age + ": " +
                task9.checkIfAgeMoreThanNumber(task9list, age));
        System.out.println("Задание 9: Все пользователи второго списка старше чем " + age + ": " +
                task9.checkIfAgeMoreThanNumber(task9list2, age));
    }

    public void delimiter(){
        for (int i=0; i < 50; i++){
            System.out.print('_');
        }
        System.out.print('\n');
    }
}