package StudyCenter.Reports;

import StudyCenter.Persons.Student;
import StudyCenter.Program;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LongReport implements Report {
    SimpleDateFormat format = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss");

    @Override
    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);
        Program program = currentStudent.getStudentProgram();
        Date programStartDate = program.getProgramStartDate();
        Date programEndDate = program.getProgramEndDate();
        StringBuilder longInfo = new StringBuilder();
        longInfo.append("STUDENT: ").append(currentStudent.getName()).append(" ").append(currentStudent.getLastname()).append("\n");
        longInfo.append("STUDENTS PROGRAM: ").append(program.getProgramName()).append("\n");
        longInfo.append("START: ").append(format.format(programStartDate)).append("\n");
        longInfo.append("PROGRAM DURATION: ").append(program.countProgramDuration()).append(" hours\n");

        if (program.getCourseList() != null) {
            longInfo.append(program.showProgramCourses());
        } else {
            longInfo.append("NO ASSIGNED COURSES FOR THIS STUDENT\n");
        }
        System.out.println(longInfo.toString());
    }
}
