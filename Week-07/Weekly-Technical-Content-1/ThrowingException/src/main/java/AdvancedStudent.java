import java.io.FileNotFoundException;

public class AdvancedStudent extends Student {

    @Override
    public void addCourse() {
        // throws keyword that comes from the super was deleted from this method signature.
        // super.addCourse();
    }

//    @Override
//    public void deleteCourse() throws FileNotFoundException { // does not compile - thrown errors didn't match so is the signature
//        super.deleteCourse();
//    }
}
