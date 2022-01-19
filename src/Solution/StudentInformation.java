package Solution;

import java.util.*;

public class StudentInformation {



    public static void main(String[] args) {

        Course math = new Course("Math", "MAT101", "MAT");
        Course physic = new Course("Physic", "FZK101", "PHY");
        Course chemistry = new Course("Chemistry", "KMY101", "CHM");

        Teacher t1 = new Teacher("Mahmut", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma", "90550000001", "PHY");
        Teacher t3 = new Teacher("Ali", "90550000002", "CHM");

        math.addTeacher(t1);
        physic.addTeacher(t2);
        chemistry.addTeacher(t3);


        Student s1 = new Student("Onur", 4, "140144015", math, physic, chemistry);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Necmi", 4, "2211133", math, physic, chemistry);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Smile", 4, "221121312", math, physic, chemistry);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();


    }




}



