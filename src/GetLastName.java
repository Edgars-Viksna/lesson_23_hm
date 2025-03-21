public class GetLastName implements PersonalInfoExtractor{

    @Override
    public String getInfo(Person p) {
        return "Last name is: " + p.getLastname();
    }
}
