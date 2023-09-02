package bankAcc;

public class Person {
    private long idCard;
    private String firstName;
    private String lastName;

    public Person(long idCard, String firstName, String lastName) {
        this.idCard = idCard;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getIdCard() {
        return idCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "person{" +
                "idCard=" + idCard +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}' + "\n" ;
    }
}
