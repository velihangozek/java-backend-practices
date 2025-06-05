package org.velihangozek;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Integer studentNumber;
    private Course[] courses = new Course[5]; // Max of 5 courses.

    public Student(String firstName, String lastName, LocalDate birthDate, Integer studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studentNumber = studentNumber;
    }

    public void addCourse(Course course, int courseNumber) {
        if (courseNumber < 1 || courseNumber > 5) {
            System.out.println("Maximum number of courses reached or invalid course number (Max. 5). Please enter the values => 1, 2, 3, 4, 5");
        } else {
            courses[courseNumber - 1] = course;
            System.out.println(course.getName() + " course added successfully");
        }
    }

    public void addNote(Course course, int note) {
        boolean found = false;

        for (Course courseInLoop : getCourses()) {

            if (courseInLoop != null && courseInLoop.getName().equals(course.getName())) {
                course.setNote(note);
                System.out.println("Successfully added the note : " + note + " for => " + course.getName());
                found = true;
                break;
            }
//            } else {
//                System.out.println("The course : " + course.getName() + " you are trying to add the note : " + note + " for does not exist for this student!");
//            }
        }

        if (!found) {
            System.out.println("The course : " + course.getName() + " you are trying to add the note : " + note + " for does not exist for this student!");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Course[] getCourses() {
        return courses;
    }

    private void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", studentNumber=" + studentNumber +
                // ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
