public class CustomExceptionMain {

    public static void main(String[] args) {

        try {
            // throw new MyCustomException("Runtime Exception -> My Custom Message");
            throw new MyCustomExceptionSecondary("Exception -> My Custom Message");
        } catch (MyCustomExceptionSecondary e) {
            throw new RuntimeException(e);
        }

    }
}