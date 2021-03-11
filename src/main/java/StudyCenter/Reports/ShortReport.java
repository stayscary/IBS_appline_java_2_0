package StudyCenter.Reports;

import StudyCenter.Persons.Student;
import StudyCenter.Program;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShortReport implements Report {
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    @Override
    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);
        Program program = currentStudent.getStudentProgram();
        Date programStartDate = program.getProgramStartDate();
        Date programEndDate = program.getProgramEndDate();
        StringBuilder shortInfo = new StringBuilder();
        shortInfo.append("STUDENT: ").append(currentStudent.getName()).append(" ").append(currentStudent.getLastname()).append("\n");
        shortInfo.append("STUDENTS PROGRAM: ").append(program.getProgramName()).append("\n");
        if (program.getProgramStartDate() != null) {
            shortInfo.append("START: ").append(format.format(programStartDate)).append("\n");
            shortInfo.append("PROGRAM DURATION: ").append(program.countProgramDuration()).append(" hours\n");
            shortInfo.append(program.showProgramProgress(programStartDate, programEndDate));
        } else {
            shortInfo.append("NO ASSIGNED COURSES FOR THIS STUDENT\n");
        }
        System.out.println(shortInfo.toString());
    }
}
