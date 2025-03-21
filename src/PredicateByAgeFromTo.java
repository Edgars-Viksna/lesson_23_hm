public class PredicateByAgeFromTo implements PredicatePerson{

  private int from;
  private int to;

    public PredicateByAgeFromTo(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Boolean test(Person person) {
        return person.getAge() > from && person.getAge() <to;
    }
}
