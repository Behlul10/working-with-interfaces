import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> myFam = new ArrayList<Person>();

        myFam.add( new Person("Dana", "Wyatt", 63) );
        myFam.add( new Person("Zachary", "Westly", 31) );
        myFam.add( new Person("Elisha", "Aslan", 14) );
        myFam.add( new Person("Ian", "Auston", 16) );
        myFam.add( new Person("Zephaniah", "Hughes", 9) );
        myFam.add( new Person("Ezra", "Aiden", 17) );

        Collections.sort(myFam);

        for (Person person : myFam) {
            System.out.println(person.toString());
        }
    }
}
