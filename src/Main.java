import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
В программе задан список Person{ String fName, String lName, int age, String email}.
Реализовать следующие функции:
- получить список  всех lName
- получить список всех e-mail
- получить список строк   вид “Jack Johnson; jack@mail.com” т.е. “fName lName; email”

Если не знаете как, Подсказка 1 на след. странице
 */

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", "Sommer", 33, "john.sommer@gmail.com"));
        personList.add(new Person("Michael", "Winter", 44, "michael.winter@gmail.com"));
        personList.add(new Person("Anna", "Morgen", 55, "anna.morgen@gmail.com"));

        System.out.println(personList);

        for (Person person : personList){
            System.out.println(person.getFirstName());
        }

        for (Person person: personList){
            System.out.println(person.getLastname());

        }

    }

public void extract (List<Person> abstractPeople, GetFirstName abstractWhat){
        for (Person person : abstractPeople){
            List<Person> byFirstName = new ArrayList<>();
            //person.get...

        }

}

}