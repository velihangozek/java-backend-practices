import java.util.ArrayList;
import java.util.List;

public class AuthService {

    private List<User> registeredUserList = new ArrayList<>();

    public void register(User user) throws UserAlreadyExistsExceptionNonRuntime {

        boolean userExists = registeredUserList.stream()
                .anyMatch(registeredUser -> registeredUser.getEmail().equalsIgnoreCase(user.getEmail()));

        if (userExists) {

            // throw new UserAlreadyExistsException(ExceptionMessages.USER_ALREADY_EXISTS + user.getEmail());
            throw new UserAlreadyExistsExceptionNonRuntime(ExceptionMessages.USER_ALREADY_EXISTS + user.getEmail());

        }

        registeredUserList.add(user);
        System.out.println("User registered successfully: " + user.getEmail());

    }

    public void getAndPrintAllUsers() {

        registeredUserList.forEach(System.out::println);

    }

    public void login(String email, String password) {

        User loggedInUser = registeredUserList.stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(ExceptionMessages.USER_NOT_FOUND + email));

        System.out.println("User logged in successfully: " + loggedInUser.getEmail());

    }

}