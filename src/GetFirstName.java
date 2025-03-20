public class GetFirstName implements PersonalInfoExtractor{


    @Override
    public String get(Person p) {
        return "First name is: " + p.getFirstName();
    }
}
