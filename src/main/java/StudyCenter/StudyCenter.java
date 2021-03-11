package StudyCenter;

import StudyCenter.Persons.Student;
import StudyCenter.Reports.LongReport;
import StudyCenter.Reports.Report;
import StudyCenter.Reports.ShortReport;

public class StudyCenter {
    public static void main(String[] args) {
        Student Ivan = new Student("Ivan", "Ivanov");
        Course Java = new Course("Java", 16);
        Course JavaScript = new Course("JavaScript", 10);
        Program program = new Program("13/03/2021 10:00", "Programming");
        Course courses[] = new Course[] {Java, JavaScript};
        program.addCoursesToProgram(courses);
        Ivan.setStudentProgram(program);
        program.calculateProgramEndDate();
        System.out.println("------------------SHORT REPORT------------------");
        Report shortReport = new ShortReport();
        shortReport.showReportForStudent(Ivan);
        System.out.println("------------------FULL REPORT-------------------");
        Report fullReport = new LongReport();
        fullReport.showReportForStudent(Ivan);
    }
}
