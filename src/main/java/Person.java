public class Person implements Comparable<Person> {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
       return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString(){
        return String.format("""
                First: %s
                Last: %s
                Age: %d
                """, this.firstName, this.lastName, this.age);
    }
}
