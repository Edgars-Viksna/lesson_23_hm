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
        List<Person> list = new ArrayList<>();
        list.add(new Person("John", "Sonner", 15, "john.sommer@gmail.com"));
        list.add(new Person("Michael", "Mosonter", 30, "michael.winter@gmail.com"));
        list.add(new Person("Sonja", "Mergen", 40, "anna.morgen@gmail.com"));

        System.out.println(list);

        List<String> byName = getInfo(list, new GetFirstName());
        System.out.println(byName);

        List<String> byLastName = getInfo(list, new GetLastName());
        System.out.println(byLastName);

        List<String> fullInfo = getInfo(list, new GetFullInfo());
        System.out.println(fullInfo);

        System.out.println("------ predicates -----------");

        List<String> fullByAge = getInfo(list, new GetFullInfo(), new PredicateByAge());
        System.out.println(fullByAge);

        List<String> firstNameByAgeFromTo = getInfo(list, new GetFirstName(), new PredicateByAgeFromTo(35, 50));
        System.out.println(firstNameByAgeFromTo);

        List<String> fullByContains = getInfo(list, new GetFullInfo(), new PredicateNameContains("so"));
        System.out.println(fullByContains);


    }
// ------------- Methods -----------------

    public static List<String> getInfo(List<Person> list, PersonalInfoExtractor extractor) {
        List<String> result = new ArrayList<>();
        for (Person person : list) {
            result.add(extractor.getInfo(person));
        }
        return result;
    }

    public static List<String> getInfo(List<Person> list, PersonalInfoExtractor extractor, PredicatePerson predicate) {
        List<String> result = new ArrayList<>();
        for (Person person : list) {
            if (predicate.test(person))
                result.add(extractor.getInfo(person));
        }
        return result;
    }
}