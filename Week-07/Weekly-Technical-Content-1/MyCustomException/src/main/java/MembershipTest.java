public class MembershipTest {
    public static void main(String[] args) {
        Membership membership = new Membership();
        membership.register(19);
        membership.register(17);
        System.out.println("More operations here after exception...");
    }
}