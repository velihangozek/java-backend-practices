public class SecondaryMembershipTest {
    public static void main(String[] args) {
        SecondaryMembership secondaryMembership = new SecondaryMembership();
        try {
            secondaryMembership.register(17);
        } catch (AgeRestrictionGeneralException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // TODO: Forgot password...
        System.out.println("More operations here after exception...");
    }
}