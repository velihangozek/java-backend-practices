public class Membership {

    public void register(int age) {
        if (age < 18) {
            throw new AgeRestrictionException("You must be 18 or older to register!");
        }

        System.out.println("You have registered successfully!");
    }
}