package org.velihangozek;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Teacher[] teachers = new Teacher[5];

        Teacher mathTeacher = new Teacher("Velihan", "Gözek", "5554443323");
        Teacher physicsTeacher = new Teacher("Furkan", "Baysan", "5554443322");
        Teacher chemistryTeacher = new Teacher("Pelin", "Ak", "5554443321");
        Teacher biologyTeacher = new Teacher("Burcu", "Taş", "5554443320");
        Teacher gymTeacher = new Teacher("Tutku", "Nar", "5554443319");

        teachers[0] = mathTeacher;
        teachers[1] = physicsTeacher;
        teachers[2] = chemistryTeacher;
        teachers[3] = biologyTeacher;
        teachers[4] = gymTeacher;

        Course mathCourse = new Course("Math", "MAT101", 8);
        Course physicsCourse = new Course("Physics", "PHY101", 6);
        Course chemistryCourse = new Course("Chemistry", "CHE101", 7);
        Course biologyCourse = new Course("Biology", "BIO101", 5);
        Course gymCourse = new Course("Gymnastics", "GYM101", 7);

        mathCourse.setTeacher(mathTeacher);
        physicsCourse.setTeacher(physicsTeacher);
        chemistryCourse.setTeacher(chemistryTeacher);
        biologyCourse.setTeacher(biologyTeacher);
        gymCourse.setTeacher(gymTeacher);

        mathTeacher.setCourse(mathCourse);
        physicsTeacher.setCourse(physicsCourse);
        chemistryTeacher.setCourse(chemistryCourse);
        biologyTeacher.setCourse(biologyCourse);
        gymTeacher.setCourse(gymCourse);

        Student[] students = new Student[4];

        Student student1 = new Student("Velihan", "Gözek", LocalDate.of(1998, 3, 8), 568);
        Student student2 = new Student("Burak", "Tok", LocalDate.of(1997, 4, 9), 569);
        Student student3 = new Student("Tutku", "Al", LocalDate.of(1995, 5, 10), 570);
        Student student4 = new Student("Tara", "Kotel", LocalDate.of(1994, 6, 11), 571);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        Course[] courses = new Course[5];
        courses[0] = mathCourse;
        courses[1] = physicsCourse;
        courses[2] = chemistryCourse;
        courses[3] = biologyCourse;
        courses[4] = gymCourse;

        System.out.println();

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        System.out.println();

        for (Course course : courses) {
            System.out.println(course);
        }

        System.out.println();

        for (Student student : students) {
            System.out.println(student);
        }

//        student1.setCourses(courses);
//        student2.setCourses(courses);
//        student3.setCourses(courses);
//        student4.setCourses(courses);

        System.out.println();

        //student1.setCourses(null);

        student1.addCourse(mathCourse, 1);
        student1.addCourse(physicsCourse, 2);
        student1.addCourse(chemistryCourse, 3);
        student1.addCourse(biologyCourse, 4);
        student1.addCourse(gymCourse, 5);
        // student1.addCourse(gymCourse, 6); => Exceeding max. number of courses

        student2.addCourse(mathCourse, 1);
        student2.addCourse(physicsCourse, 2);
        student2.addCourse(chemistryCourse, 3);
        student2.addCourse(biologyCourse, 4);
        student2.addCourse(gymCourse, 5);

        student3.addCourse(mathCourse, 1);
        student3.addCourse(physicsCourse, 2);
        student3.addCourse(chemistryCourse, 3);
        student3.addCourse(biologyCourse, 4);
        student3.addCourse(gymCourse, 5);

        student4.addCourse(mathCourse, 1);
        student4.addCourse(physicsCourse, 2);
        student4.addCourse(chemistryCourse, 3);
        student4.addCourse(biologyCourse, 4);
        student4.addCourse(gymCourse, 5);

        System.out.println();

        student1.addNote(mathCourse, 97);
        student1.addNote(physicsCourse, 88);
        student1.addNote(chemistryCourse, 93);
        student1.addNote(biologyCourse, 91);
        student1.addNote(gymCourse, 100);

        student2.addNote(mathCourse, 97);
        student2.addNote(physicsCourse, 88);
        student2.addNote(chemistryCourse, 93);
        student2.addNote(biologyCourse, 91);
        student2.addNote(gymCourse, 100);

        student3.addNote(mathCourse, 97);
        student3.addNote(physicsCourse, 88);
        student3.addNote(chemistryCourse, 93);
        student3.addNote(biologyCourse, 91);
        student3.addNote(gymCourse, 100);

        student4.addNote(mathCourse, 97);
        student4.addNote(physicsCourse, 88);
        student4.addNote(chemistryCourse, 93);
        student4.addNote(biologyCourse, 91);
        student4.addNote(gymCourse, 100);

        System.out.println();

        for (Student student : students) {
            for (Course course : student.getCourses()) {
                System.out.println("Student: " + student.getFirstName().toUpperCase() + " received a score of: " + course.getNote() + " for the course: " + course.getName().toUpperCase());
            }
        }
    }
}
