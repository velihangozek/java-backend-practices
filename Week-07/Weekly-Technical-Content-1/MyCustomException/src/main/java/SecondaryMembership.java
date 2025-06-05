public class SecondaryMembership {
    public void register(int age) throws AgeRestrictionGeneralException {
        if (age < 18) {
            throw new AgeRestrictionGeneralException("You must be 18 or older to register!");
        }

        System.out.println("You have registered successfully!");
    }
}