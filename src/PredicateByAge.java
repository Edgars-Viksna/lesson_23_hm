public class PredicateByAge implements PredicatePerson {


    @Override
    public Boolean test (Person person) {
        return person.getAge() <50;
    }
}
