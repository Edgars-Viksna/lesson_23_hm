public class PredicateNameContains implements PredicatePerson {

    private String findString;

    public PredicateNameContains(String findString) {
        this.findString = findString;
    }

    @Override
    public Boolean test(Person person) {
        return person.getLastname().toLowerCase().contains(findString) ||
                person.getFirstName().toLowerCase().contains(findString);
    }
}
