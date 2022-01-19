package Solution;

public class Student {

    String name;
    int stuNo;
    String classes;
    Course math;
    Course physic;
    Course chemistry;
    double average;
    boolean isPass;


    public Student(String name, int stuNo, String classes, Course course1, Course course2, Course course3) {

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.math = course1;
        this.physic = course2;
        this.chemistry = course3;

        this.average = 0;
        this.isPass = false;

    }


    public void addBulkExamNote(int a, int b, int c){

        if(a >= 0 && a <= 100)
            this.math.note = a;

        if(b >= 0 && b <= 100)
            this.physic.note = b;

        if(c >= 0 && c <= 100)
            this.chemistry.note = c;


    }


    public void calculateAverage(){

        this.average = (this.math.note + this.physic.note + this.chemistry.note) / (double)3;

    }


    public void isPass(){

        calculateAverage();

        if(this.average >= 55)
            System.out.println("Student " + this.name + " Congrats! you passed the class");
        else
            System.out.println("Student " + this.name + " failed the class");


    }
}
