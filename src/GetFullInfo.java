public class GetFullInfo implements PersonalInfoExtractor{
    @Override
    public String getInfo(Person p) {
        return "First name: " + p.getFirstName() + ", last name: " + p.getLastname()
                + ", email: " + p.getEmail();
    }
}
