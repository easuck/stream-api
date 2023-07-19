public class User {

    private String name;
    private int age;
    private Nationality nationality;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public User(Nationality nationality){
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Nationality getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public enum Nationality{
        Русский("русский"),
        Украиенец("украинец"),
        Белорус("белорус");

        private String title;

        Nationality(String title){
            this.title = title;
        }
    }
}
