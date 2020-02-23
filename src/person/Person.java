package person;

public class Person implements Comparable<Person> {
    private String fName;
    private String lName;
    private String email;
    private long phoneNumber;

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
