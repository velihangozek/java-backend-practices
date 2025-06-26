public class UserAuthMain {

    public static void main(String[] args) {

        AuthService authService = new AuthService();

        try {

            User user = new User("velihangozek@hotmail.com", "12345");
            User user2 = new User("velo@hotmail.com", "12346");
            User user3 = new User("velo2@hotmail.com", "12347");
            User user4 = new User("velo3@hotmail.com", "12348");

            System.out.println();

            authService.register(user);
            authService.register(user2);
            authService.register(user3);
            authService.register(user4);

            System.out.println();

            authService.register(user4);


        } catch (UserAlreadyExistsExceptionNonRuntime e) {

            System.out.println(e.getMessage());

        }

        System.out.println();

        authService.login("velo2@hotmail.com", "12347");

        System.out.println();

        authService.getAndPrintAllUsers();

//        authService.register(user);
//        authService.register(user2);
//        authService.register(user3);
//        authService.register(user4);

    }

}