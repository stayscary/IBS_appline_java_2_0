package StudyCenter.Persons;

import StudyCenter.Program;

public class Student extends Person {
    private Program studentProgram;

    public Student(String name, String lastname) {
        super(name, lastname);
    }

    public Program getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(Program studentProgram) {
        this.studentProgram = studentProgram;
    }
}
