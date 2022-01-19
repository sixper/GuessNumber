package Solution;

public class Course {

    String name;
    String code;
    String prefix;
    int note;
    Teacher t;


    public Course(String name, String code, String prefix) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;

        this.note = 0;
        this.t = null;


    }


    public void addTeacher(Teacher t){

        this.t = t;

    }


    public void printTeacher(){

        System.out.println("The teacher of " + name + " class is " + t.name);

    }

}
