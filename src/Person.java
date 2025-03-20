public class Person {
    private String firstName;
    private String lastname;
    private int age;
    private String email;

    public Person(String firstName, String lastname, int age, String email) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person: " +
                " firstName " + firstName +
                ", lastname " + lastname +
                ",   age =" + age +
                ",      email: " + email + System.lineSeparator();
    }
}
