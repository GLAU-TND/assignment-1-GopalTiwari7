package person;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {
    private String fName;
    private String lName;
    private String email;
    private long phoneNumber;
    List<Long> list = new ArrayList<>();

    public Person() {
    }
    public Person(String fName, String lName, String email, long phoneNumber, List<Long> list) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.list = list;
    }
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public List<Long> getList() {
        return list;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        list.add(phoneNumber);
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
