public class GetFirstName implements PersonalInfoExtractor {


    @Override
    public String getInfo(Person p) {
        return "First name is: " + p.getFirstName();
    }
}
